package org.example.dao;

import org.example.model.User;

public interface UserDao {
    public User save(User user);
    public User update(int id, User user);
    public void delete(int id);
    public User get(int id);
}
