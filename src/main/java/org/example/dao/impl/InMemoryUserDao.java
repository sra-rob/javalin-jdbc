package org.example.dao.impl;

import org.example.dao.UserDao;
import org.example.exception.UserAlreadyExistsException;
import org.example.exception.UserNotFoundException;
import org.example.model.User;

import java.util.*;

public class InMemoryUserDao implements UserDao {
    private int userCount = 1;
    private final Map<Integer, User> users = new HashMap<>();
    @Override
    public User save(User user) {
        int userId = user.getId();
        if(userId == 0) {
            userId = userCount;
            user.setId(userId);
        }
        users.put(userId, user);
        userCount++;
        return user;
    }

    @Override
    public User update(int id, User user) {
        if(users.containsKey(id)) {
            User userToUpdate = users.get(id);
            userToUpdate.setUsername(user.getUsername());
            users.put(id, user);
            return userToUpdate;
        } else {
            return save(user);
        }
    }

    @Override
    public void delete(int id) {
        users.remove(id);
    }

    @Override
    public List<User> get() {
        return new ArrayList<>(users.values());
    }

    @Override
    public Optional<User> getById(int id) {
        if(users.containsKey(id)) {
            return Optional.of(users.get(id));
        }
        return Optional.empty();
    }
}
