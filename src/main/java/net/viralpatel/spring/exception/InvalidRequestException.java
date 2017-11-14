package net.viralpatel.spring.exception;

import org.springframework.validation.Errors;

@SuppressWarnings("serial")
public class InvalidRequestException extends RuntimeException {
    private String errors;

    public InvalidRequestException(String message, String errors) {
        super(message);
        this.errors = errors;
    }

    public String getErrors() { return errors; }
}