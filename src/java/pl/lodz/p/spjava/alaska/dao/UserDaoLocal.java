/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.p.spjava.alaska.dao;

import java.util.List;
import javax.ejb.Local;
import pl.lodz.p.spjava.alaska.model.User;

/**
 *
 * @author Artur
 */
@Local
public interface UserDaoLocal {

    void addUser(User user);

    void editUser(User user);

    void deleteId(int userId);

    User getUser(int userId);

    List<User> getAllUsers();
    
}
