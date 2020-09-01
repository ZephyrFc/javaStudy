package com.example.demo.demo.controller;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zephyr
 * @date2020/8/1214:18
 */
@RestController
@Service
public class TestDemoController {
    @RequestMapping("/boot/hello")
    public String demo(){
        return "hello world!";
    };



}
