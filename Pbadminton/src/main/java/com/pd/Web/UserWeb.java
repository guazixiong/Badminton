package com.pd.Web;

import com.pd.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserWeb {
    @Autowired
    UserService userService;

    //注册
    @RequestMapping(value = "register")
    public String register(@RequestParam("uname")String uname){
        return userService.register(uname);
    }
}
