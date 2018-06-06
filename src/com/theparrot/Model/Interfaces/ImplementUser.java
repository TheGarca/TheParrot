/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.theparrot.Model.Interfaces;

import com.theparrot.Model.User;
import java.util.List;

/**
 *
 * @author gustavomiara
 */
public interface ImplementUser {
    
    public void insert(User user);
    
    public void update(User user);
    
    public void delete(int id);
    
    public List<User> getUserByName(String name);
    
    public List<User> getAllUser();
    
    public User getOneUser(int id);
    
}
