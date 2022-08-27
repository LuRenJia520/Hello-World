package com.example.demo.Controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "Controller", tags = { "Controller测试接口" })
@RequestMapping(value = "/hello")
public class HelloSpringBootController {

    @GetMapping
    public String helloWorld(){
        return "hello,SpringBoot";
    }
}
