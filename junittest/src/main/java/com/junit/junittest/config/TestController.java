package com.junit.junittest.config;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author fhj
 * @version 1.0
 * @ClassName TestController
 * @Description TODO
 * @date 2020/6/28  19:09
 **/
@ControllerAdvice
public class TestController {


    @ExceptionHandler(Throwable.class)
    @ResponseBody
    public String exc(Exception e) {
        return "ok";
    }
}
