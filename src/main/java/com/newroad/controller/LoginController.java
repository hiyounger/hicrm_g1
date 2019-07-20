package com.newroad.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @ResponseBody
    @RequestMapping("/login.do")
    public Boolean doLogin(@Param("username") String username,@Param("password") String password){
        System.out.println(username+","+password);
        if(username.trim().equals(password.trim())){
            return true;
        }
        return false;
    }
}
