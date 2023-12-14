package org.example.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(int id) {
        super("User with id %d could not be found".formatted(id));
    }
}
