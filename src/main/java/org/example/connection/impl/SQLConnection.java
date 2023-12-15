package org.example.connection.impl;

import org.example.connection.IConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLConnection implements IConnection {
    private static Connection connection;
    private final String url;
    private final String user;
    private final String pass;
    public SQLConnection(String url, String user, String pass) {
        this.url = url;
        this.user = user;
        this.pass = pass;
    }
    @Override
    public Connection getConnection() {
        if(connection == null) {
            try {
                connection = DriverManager.getConnection(url, user, pass);
            } catch(SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
}
