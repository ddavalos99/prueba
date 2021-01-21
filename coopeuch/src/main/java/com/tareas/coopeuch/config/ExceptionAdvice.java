package com.tareas.coopeuch.config;

import com.tareas.coopeuch.model.ApiResponse;

import io.swagger.annotations.ApiOperation;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionAdvice {

    @ExceptionHandler(RuntimeException.class)
    @ApiOperation(value = "Excepciones",notes = "Excepciones Generadas")
    public ApiResponse handleNotFoundException(RuntimeException ex) {
        ApiResponse apiResponse = new ApiResponse(400, "Bad request", null);
        return apiResponse;
    }

}
