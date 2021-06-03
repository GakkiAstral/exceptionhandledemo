package com.bjsxt.web.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * 全局异常处理器
 */
//@ControllerAdvice
public class GlobalExceptionHandle {
    @ExceptionHandler({java.lang.NullPointerException.class,java.lang.ArithmeticException.class})
    public String NullPointExceptionHandle(Exception e, Model model){
        model.addAttribute("msg",e);
        return "error";

    }

    @ExceptionHandler({java.lang.Exception.class})
    public String ExceptionHandle(Exception e,Model model){
        model.addAttribute("msg",e);
        return "error2";
    }
}
