package com.app.dao.services;

import com.app.dao.interfaces.UserDao;
import com.app.dao.repositories.UserRepository;
import com.app.entities.User;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UserDao {
    private UserRepository userRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return Lists.newArrayList(userRepository.findAll());
    }

    @Override
    public List<User> getUserById(long id) {
        return  userRepository.findUserById(id);
    }

    @Override
    public List<User> getUserByEmail(String email) {
        return userRepository.findUserByEmail(email);
    }

    @Override
    public List<User> getUsersByLogin(String login) {
        return userRepository.findUserByLogin(login);
    }
}
