package org.example.dao;

import org.example.model.User;

import java.util.List;
import java.util.Optional;

public interface UserDao {
    public User save(User user);
    public User update(int id, User user);
    public void delete(int id);
    public List<User> get();
    public Optional<User> getById(int id);
}
