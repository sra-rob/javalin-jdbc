package org.example;

import io.javalin.Javalin;
import org.example.connection.impl.SQLConnection;
import org.example.dao.UserDao;
import org.example.dao.impl.InMemoryUserDao;
import org.example.dao.impl.JDBCDao;
import org.example.model.User;
import org.example.service.UserService;
import org.example.service.impl.UserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        SQLConnection connection = new SQLConnection(
                "jdbc:mysql://localhost/rev",
                "root",
                "Sugarr11--"
        );
        UserDao userDao = new JDBCDao(connection);
        UserService userService = new UserServiceImpl(userDao);
        userService.save(new User("Simon"));
        userService.save(new User("Robert"));
        userService.save(new User("Akers"));

//        Javalin app = Javalin.create().start(9000);
//        app.get("/", ctx -> {
//            ctx.result("Hello World");
//        });
//        app.get("users/{id}", ctx -> {
//            int id = Integer.valueOf(ctx.pathParam("id"));
//            User user = userService.getById(id);
//            ctx.json(users.get(id));
//        });
//        app.post("users", ctx -> {
//            User user = ctx.bodyAsClass(User.class);
//            User savedUser = users.save(user);
//            ctx.json(savedUser);
//        });
//        app.put("users", ctx -> {
//            User user = ctx.bodyAsClass(User.class);
//            User updatedUser = users.update(user.getId(), user);
//            ctx.json(updatedUser);
//        });
//        app.delete("users/{id}", ctx -> {
//            int id = Integer.valueOf(ctx.pathParam("id"));
//            users.delete(id);
//        });
    }
}