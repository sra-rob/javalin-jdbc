package org.example.dao.impl;

import org.example.connection.impl.SQLConnection;
import org.example.dao.UserDao;
import org.example.model.User;

import java.util.List;
import java.util.Optional;

public class JDBCDao implements UserDao {
    SQLConnection connection;
    public JDBCDao(SQLConnection connection) {
        this.connection = connection;
    }

    @Override
    public User save(User user) {
        return null;
    }

    @Override
    public User update(int id, User user) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<User> get() {
        return null;
    }

    @Override
    public Optional<User> getById(int id) {
        return Optional.empty();
    }
}
