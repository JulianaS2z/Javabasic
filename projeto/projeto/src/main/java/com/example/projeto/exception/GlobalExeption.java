package com.example.projeto.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class GlobalExeption {
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<Map<String, Object>> IllegalArgumentException(IllegalArgumentException erro) {
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(Map.of("mensagem", erro.getMessage()));
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, Object>> methodArgumentNotValidException(MethodArgumentNotValidException erro) {
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(Map.of("mensagem", erro.getFieldErrors().get(0).getDefaultMessage()));
    }
}
