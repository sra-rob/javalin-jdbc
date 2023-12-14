package org.example;

import io.javalin.Javalin;
import org.example.dao.UserDao;
import org.example.dao.impl.InMemoryUserDao;
import org.example.model.User;
public class Main {
    public static void main(String[] args) {
        UserDao users = new InMemoryUserDao();
        users.save(new User("Simon"));
        users.save(new User("Robert"));
        users.save(new User("Akers"));

        Javalin app = Javalin.create().start(9000);
        app.get("/", ctx -> {
            ctx.result("Hello World");
        });
        app.get("users/{id}", ctx -> {
            int id = Integer.valueOf(ctx.pathParam("id"));
            ctx.json(users.get(id));
        });
        app.post("users", ctx -> {
            User user = ctx.bodyAsClass(User.class);
            User savedUser = users.save(user);
            ctx.json(savedUser);
        });
        app.put("users", ctx -> {
            User user = ctx.bodyAsClass(User.class);
            User updatedUser = users.update(user.getId(), user);
            ctx.json(updatedUser);
        });
        app.delete("users/{id}", ctx -> {
            int id = Integer.valueOf(ctx.pathParam("id"));
            users.delete(id);
        });
    }
}