package com.behl.pilotrun.exception;



import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(value = RuntimeException.class)
    public ResponseEntity<ExceptionWrapper> handleGenericNotFoundException(RuntimeException e) {
        ExceptionWrapper error = new ExceptionWrapper();
       // error.setTimestamp(LocalDateTime.now());
        error.setErrorMsg(e.getMessage());
        error.setErrorCode((HttpStatus.NOT_FOUND.value()));
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }
}
