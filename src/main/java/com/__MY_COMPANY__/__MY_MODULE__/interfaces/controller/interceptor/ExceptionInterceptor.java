package com.__MY_COMPANY__.__MY_MODULE__.interfaces.controller.interceptor;

import com.__MY_COMPANY__.__MY_MODULE__.exception.SomeException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice(basePackages = {"com.__MY_MODULE__.__MY_MODULE__.controller.rest"})
public class ExceptionInterceptor {

    private static final Logger LOG = LoggerFactory.getLogger(ExceptionInterceptor.class);
    private static final Logger EXCEPTION_LOG = LoggerFactory.getLogger("exceptionLogger");

    @Value("${spring.application.name}")
    private String serviceIdentifier;


    private ObjectMapper objectMapper = new ObjectMapper();

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(value = SomeException.class)
    public
    @ResponseBody
    void someExceptionHandler(HttpServletRequest req, SomeException e)
            throws Exception {
            // do logging & stuff here
    }

}
