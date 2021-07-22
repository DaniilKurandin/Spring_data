package com.app.dao.interfaces;

import com.app.entities.User;

import java.util.List;

public interface UserDAO {
    User addUser(User user);

    List<User> getAllUser();

    List<User> getUserById(long id);

    List<User> getUserByEmail(String email);

    List<User> getUsersByLogin(String login);
}
