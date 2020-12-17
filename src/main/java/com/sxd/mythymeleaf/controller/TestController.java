package com.sxd.mythymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/getgit")
    public String getgit(){
        return "分支sxd1添加的一个Controller！！！";
    }
}
