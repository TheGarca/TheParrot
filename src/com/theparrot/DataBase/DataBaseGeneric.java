
package com.theparrot.DataBase;

import com.theparrot.Configurations.Configurations;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Map;


public class DataBaseGeneric extends DataBase {
    
    public String table;
    
    public DataBaseGeneric(){}
    
    public DataBaseGeneric(Configurations config) {
        super(config);
    }
    
    public DataBaseGeneric(Configurations config, String table){
        super(config);
        this.table = table;
    }
    
    public void checkConnection(){
        System.out.println("checkConnection");
        if(!this.connected){
            System.out.println("Conect database");
            this.connect();
        }else{
            System.out.println("No conect database");
        }
    }
    
    public Boolean checkEmptyTable(){
        if(this.table.isEmpty()){
            System.out.println("Nenhuma tabela foi selecionada.");
            return false;
        }
        return true;
    }
    
    public ResultSet getOne(int id){
        this.checkConnection();
        if(!this.checkEmptyTable())
            return null;
        return this.query("SELECT * FROM " + this.table + " WHERE id = ?", id);
    }
    
    public ResultSet getAll(){
        this.checkConnection();
        if(!this.checkEmptyTable())
            return null;
        return this.query("SELECT * FROM " + this.table);
    }
    
    public ResultSet getLike(String field, String value){
        this.checkConnection();
        if(!this.checkEmptyTable())
            return null;
        return this.query("SELECT * FROM " + this.table + " WHERE " + field + " LIKE '%" + value + "%'");
    }
    
    public void genericInsert(Map<Object, Object> mapObj){
        System.out.println("genericInsert");
        this.checkConnection();
        System.out.println("genericInsert");
        if(!this.checkEmptyTable())
            return;
        
        StringBuilder sql = new StringBuilder();
        ArrayList<Object> list = new ArrayList<>();
        
        if(!mapObj.isEmpty()){
            for(Map.Entry<Object, Object> entry : mapObj.entrySet()) {
                if(entry.getValue() == null || entry.getValue().equals("")) {
                    mapObj.remove(entry.getKey());
                }
            }
        }
        
        sql.append("INSERT INTO");
        sql.append(" ").append(this.table);
        sql.append("(");

        if(!mapObj.isEmpty()){
            for(Map.Entry<Object, Object> entry : mapObj.entrySet()) {
                sql.append(entry.getKey());
                sql.append(",");
            }
        }

        sql = new StringBuilder(sql.subSequence(0, sql.length() - 1));
        sql.append(")");
        sql.append(" VALUES");
        sql.append("(");

        if(!mapObj.isEmpty()) {
            for(Map.Entry<Object, Object> entry : mapObj.entrySet()) {
                list.add(entry.getValue());
                sql.append("?");
                sql.append(",");
            }
        }

        sql = new StringBuilder(sql.subSequence(0, sql.length() - 1));
        sql.append(")");

        System.err.println("SQL insert: " + sql.toString());
        this.execute(sql.toString(), list);
    }
    
    public void genericUpdate(Map<Object, Object> mapObj, Map<Object, Object> mapCondition){
        this.checkConnection();
        if(!this.checkEmptyTable())
            return;
        
        StringBuilder sql = new StringBuilder();
        ArrayList<Object> list = new ArrayList<>();

        if(!mapObj.isEmpty()){
            for(Map.Entry<Object, Object> entry : mapObj.entrySet()) {
                if(entry.getValue() == null || entry.getValue().equals("")) {
                    mapObj.remove(entry.getKey());
                }
            }
        }

        if(!mapCondition.isEmpty()){
            for(Map.Entry<Object, Object> entry : mapCondition.entrySet()) {
                if(entry.getValue() == null || entry.getValue().equals("")) {
                    mapCondition.remove(entry.getKey());
                }
            }
        }

        sql.append("UPDATE");
        sql.append(" ").append(this.table);
        sql.append(" SET");
        sql.append(" ");

        if (!mapObj.isEmpty()){
            for (Map.Entry<Object, Object> entry : mapObj.entrySet()) {
                sql.append(entry.getKey()).append("=").append("?");
                sql.append(",");
                list.add(entry.getValue());
            }
        }

        sql = new StringBuilder(sql.subSequence(0, sql.length() - 1));
        sql.append(" WHERE");
        sql.append(" ");

        if (!mapCondition.isEmpty()){
            for (Map.Entry<Object, Object> entry : mapCondition.entrySet()) {
                sql.append(entry.getKey()).append("=").append("?");
                sql.append(",");
                list.add(entry.getValue());
            }
        }

        sql = new StringBuilder(sql.subSequence(0, sql.length() - 1));

        this.execute(sql.toString(), list);
    }
    
    public void genericDelete(Map<Object, Object> mapCondition){
        this.checkConnection();
        if(!this.checkEmptyTable())
            return;
        
        StringBuilder sql = new StringBuilder();
        ArrayList<Object> list = new ArrayList<>();

        if (!mapCondition.isEmpty()) {
            for (Map.Entry<Object, Object> entry : mapCondition.entrySet()) {
                if(entry.getValue() == null || entry.getValue().equals("")) {
                    mapCondition.remove(entry.getKey());
                }
            }
        }

        sql.append("DELETE FROM");
        sql.append(" ").append(this.table);
        sql.append(" WHERE");
        sql.append(" ");

        if (!mapCondition.isEmpty()) {
            for (Map.Entry<Object, Object> entry : mapCondition.entrySet()) {
                sql.append(entry.getKey()).append("=").append("?");
                sql.append(" AND ");
                list.add(entry.getValue());
            }
        }

        sql = new StringBuilder(sql.subSequence(0, sql.length() - 5));
        
        this.execute(sql.toString(), list);
    }
}
