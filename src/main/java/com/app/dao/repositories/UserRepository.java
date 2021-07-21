package com.app.dao.repositories;

import com.app.entities.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {
    List<User> findUserByEmail(String email);

    List<User> findUserById(long id);

    List<User> findUserByLogin(String login);
}
