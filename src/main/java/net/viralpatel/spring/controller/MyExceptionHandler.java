package net.viralpatel.spring.controller;
	
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import binding.ErrorResource;
import net.viralpatel.spring.exception.InvalidRequestException;
	
@ControllerAdvice
public class MyExceptionHandler extends ResponseEntityExceptionHandler {
	
    @ExceptionHandler({ InvalidRequestException.class })
    protected ResponseEntity<Object> handleInvalidRequest(RuntimeException e, WebRequest request) {
        InvalidRequestException ire = (InvalidRequestException) e;

     //   List<FieldError> fieldErrors = ire.getErrors().getFieldErrors();
       

        ErrorResource error = new ErrorResource(HttpStatus.INTERNAL_SERVER_ERROR.toString(), "INTERNAL_SERVER_ERROR", "CustomerIdNotExist", ire.getMessage());
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        return handleExceptionInternal(e, error, headers, HttpStatus.INTERNAL_SERVER_ERROR, request);
    }

   // ... other handlers for other exceptions ...
}