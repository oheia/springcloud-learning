package com.oheia.cloud.controller;

import com.oheia.cloud.domain.CommonResult;
import com.oheia.cloud.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserHystrixController {
    @Resource
    private UserService userService;

    @GetMapping(value = "/testFallback/{id}")
    public CommonResult testFallback(@PathVariable Long id){
        return userService.getUser(id);
    }
}
