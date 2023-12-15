package org.example.service.impl;

import org.example.dao.UserDao;
import org.example.model.User;
import org.example.service.UserService;

import java.sql.Connection;
import java.util.List;
import java.util.Optional;

public class UserServiceImpl implements UserService {
    private UserDao userDao;
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }
    @Override
    public User save(User user) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public User update(int id, User user) {
        return null;
    }

    @Override
    public List<User> get() {
        return null;
    }

    @Override
    public User getById(int id) {
        return null;
    }
}
