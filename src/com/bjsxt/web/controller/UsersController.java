package com.bjsxt.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UsersController {

    @RequestMapping("/getUsers")
    public String getUsers(){
        //空指针异常
        String str = null;
        str.length();
        return "showuser";
        //除数为0异常
        /*int flag = 1/0;
        return "showuser";*/
        //索引越界异常
        /*int[] arr = new int[1];
        arr[2] = 10;
        return "showuser";*/
    }
}
