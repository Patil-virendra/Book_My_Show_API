package com.api.exceptions;

import com.api.payloads.ApiResponce;


import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestControllerAdvice
public class GlobleExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiResponce> ResourceNotFoundExceptionHandler(ResourceNotFoundException ex){
        String message = ex.getMessage();
        ApiResponce apiResponce=new ApiResponce(message,false);
        return new ResponseEntity<>(apiResponce, HttpStatus.NOT_FOUND);

    }


    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
                                                                  HttpHeaders headers, HttpStatusCode status, WebRequest request) {
        Map<String ,Object> body=new HashMap<>();
        body.put("timeStamp", System.currentTimeMillis());
        body.put("statusCode", HttpStatus.BAD_REQUEST);
        List<String> error=ex.getBindingResult()
                .getFieldErrors().stream()
                .map(x->x.getDefaultMessage())
                .collect(Collectors.toList());
        body.put("message", error);
        return new ResponseEntity<Object>(body,HttpStatus.BAD_REQUEST);
}

   // @Nullable
//    protected ResponseEntity<Object> handleMethodArgumentNotValid(
//            MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request) {
//
//        return handleExceptionInternal(ex, null, headers, status, request);
//    }

}
