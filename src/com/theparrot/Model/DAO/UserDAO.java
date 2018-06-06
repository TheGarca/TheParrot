package com.theparrot.Model.DAO;

import com.theparrot.Configurations.ConfigurationsMySQL;
import com.theparrot.Model.Interfaces.ImplementUser;
import com.theparrot.DataBase.DataBaseGeneric;
import com.theparrot.Model.User;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDAO extends DataBaseGeneric implements ImplementUser{
    
    public ArrayList<User> list;
    
    public UserDAO(){
        super(new ConfigurationsMySQL(), "java_user");
    }
            
    @Override
    public void insert(User user){
        Map<Object, Object> mapObj = new HashMap<>();
        mapObj.put("name", user.getName());
        this.genericInsert(mapObj);
    }

    @Override
    public void update(User user){
        Map<Object, Object> mapObj = new HashMap<>();
        Map<Object, Object> mapConditions = new HashMap<>();
        mapObj.put("name", user.getName());
        mapConditions.put("id", user.getId());
        this.genericUpdate(mapObj, mapConditions);
    }

    @Override
    public void delete(int id) {
        Map<Object, Object> mapConditions = new HashMap<>();
        mapConditions.put("id", id);
        this.genericDelete(mapConditions);
    }

    @Override
    public List<User> getUserByName(String name){
        this.list = new ArrayList<>();
        try {
            ResultSet rs = this.getLike("name", name);
            while (rs.next()) { 
                User user = new User();
                user.setId(rs.getInt(1));
                user.setName(rs.getString("name"));
                list.add(user);
            }
            return list;
        } catch (SQLException ex){
            System.out.println("Houve um erro ao obter um curso: " + ex.getMessage());
        }
        return null;
    }

    @Override
    public List<User> getAllUser(){
        list = new ArrayList<>();
        ResultSet rs = this.getAll();
        try {
            while(rs.next()){
                User user = new User();
                user.setId(rs.getInt(1));
                user.setName(rs.getString("name"));
                list.add(user);
            }
            return list;
        } catch (SQLException ex) {
            System.out.println("Erro ao retornar um curso pelo nome: " + ex.getMessage());
        }
        return null;
    }
    
    @Override
    public User getOneUser(int id){
        ResultSet rs = this.getOne(id);
        User user = new User();
        try {
            user.setId(rs.getInt(1));
            user.setName(rs.getString("name"));
            return user;
        } catch (SQLException ex) {
            System.out.println("Erro ao retornar um curso pelo id: " + ex.getMessage());
        }
        return null;
    }
}
