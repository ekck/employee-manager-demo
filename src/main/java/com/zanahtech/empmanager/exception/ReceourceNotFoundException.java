package com.zanahtech.empmanager.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ReceourceNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    public ReceourceNotFoundException(String message){
        super(message);
    }

}
