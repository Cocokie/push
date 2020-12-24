package com.lix.push.controller;

import com.lix.push.entity.User;
import com.lix.push.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2020-12-23 20:49:43
 */
@RestController
@RequestMapping("user")
public class UserController {



    @GetMapping("get")
    public String userGet() {
        return "success1";
    }


}