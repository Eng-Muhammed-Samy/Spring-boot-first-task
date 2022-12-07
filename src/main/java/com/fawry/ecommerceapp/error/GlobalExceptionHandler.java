package com.fawry.ecommerceapp.error;

import com.fawry.ecommerceapp.error.exceptions.DuplicatedEntityException;
import com.fawry.ecommerceapp.error.exceptions.RecordNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Arrays;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(RecordNotFoundException.class)
    public ResponseEntity<?> handleRecordNotFound(RecordNotFoundException ex){
        ErrorResponse errorResponse = new ErrorResponse(ex.getLocalizedMessage(), Arrays.asList(ex.getMessage()));
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(errorResponse);
    }

    @ExceptionHandler(DuplicatedEntityException.class)
    public ResponseEntity<?> handleDuplicateEntity(DuplicatedEntityException ex){
        ErrorResponse errorResponse = new ErrorResponse(ex.getLocalizedMessage(), Arrays.asList(ex.getMessage()));
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(errorResponse);
    }
}
