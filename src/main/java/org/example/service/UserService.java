package org.example.service;

import org.example.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    public User save(User user);
    public void delete(int id);
    public User update(int id, User user);
    public List<User> get();
    public User getById(int id);
}
