package com.fawry.ecommerceapp.error.exceptions;

public class DuplicatedEntityException extends RuntimeException{
    public DuplicatedEntityException() {
    }

    public DuplicatedEntityException(String message) {
        super(message);
    }
}
