package org.generation.exceptions;

public class NotFoundContactException extends RuntimeException {
    public NotFoundContactException(String message) {
        super(message);
    }
}
