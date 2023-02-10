package com.todo.dev.config;


import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.JwtException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionConfig {

    // 타임아웃
    @ExceptionHandler(ExpiredJwtException.class)
    public ResponseEntity<String> tokenTimeOut(ExpiredJwtException e){
        ResponseEntity<String> responseEntity = new ResponseEntity<>("refresh token", HttpStatus.UNAUTHORIZED);
        return responseEntity;
    }


    // token에 문제가 있을 경우
    @ExceptionHandler(JwtException.class)
    public ResponseEntity<String> jwtExceptionHandler(JwtException e){
        ResponseEntity<String> responseEntity = new ResponseEntity<>("token error", HttpStatus.UNAUTHORIZED);
        return responseEntity;
    }
}
