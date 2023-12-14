package org.example.exception;

public class UserAlreadyExistsException extends RuntimeException{
    public UserAlreadyExistsException(int id) {
        super("User with id %d already exists".formatted(id));
    }
}
