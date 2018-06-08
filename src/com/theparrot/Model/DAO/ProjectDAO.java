package com.theparrot.Model.DAO;

import com.theparrot.Configurations.ConfigurationsMySQL;
import com.theparrot.Model.Interfaces.ImplementProject;
import com.theparrot.DataBase.DataBaseGeneric;
import com.theparrot.Model.Project;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProjectDAO extends DataBaseGeneric implements ImplementProject{
    
    public ArrayList<Project> list;
    
    public ProjectDAO(){
        super(new ConfigurationsMySQL(), "java_Project");
    }
            
    @Override
    public void insert(Project Project){
        Map<Object, Object> mapObj = new HashMap<>();
        mapObj.put("name", Project.getName());
        mapObj.put("valor", Project.getValor());
        mapObj.put("descricao", Project.getDescricao());
        mapObj.put("dataFinal", Project.getDataFinal());
        mapObj.put("empresaId", Project.getEmpresaId());
        this.genericInsert(mapObj);
    }

    
    @Override
    public List<Project> getAllProject(){
        list = new ArrayList<>();
        ResultSet rs = this.getAll();
        try {
            while(rs.next()){
                Project Project = new Project();
                Project.setId(rs.getInt(1));
                Project.setName(rs.getString("name"));
                Project.setValor(rs.getString("valor"));
                Project.setDescricao(rs.getString("descricao"));
                Project.setDataFinal(rs.getString("dataFinal"));
                Project.setEmpresa(rs.getString("empresa"));
                list.add(Project);
            }
            return list;
        } catch (SQLException ex) {
            System.out.println("Erro ao retornar um curso pelo nome: " + ex.getMessage());
        }
        return null;
    }
    
}
