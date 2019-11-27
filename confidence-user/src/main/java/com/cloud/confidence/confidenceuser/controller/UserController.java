package com.cloud.confidence.confidenceuser.controller;

import com.cloud.confidence.confidenceuser.api.UserService;
import com.cloud.confidence.confidenceuser.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 *@create yubenling
 *@date  2019/11/26
 *@desc
 *  */
@RestController
public class UserController {


    @Autowired
    private UserService userService;

    @RequestMapping("/test")
    public void test(){
        User user = userService.selectById(1);
        System.out.println(user.toString());
    }
}
