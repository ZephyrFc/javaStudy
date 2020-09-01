package com.example.demo.demo.controller;

import com.example.demo.demo.service.PmsProductService;
import com.example.demo.demo.service.impl.PmsProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @authorzephyr
 * @date2020/8/1310:48
 */
@RestController
public class MybatisController {
    @Autowired
    private PmsProductServiceImpl productService;


    @RequestMapping("/boot/mybatis")
    public Object testMybatis(){
        Runnable runnable = new Runnable(){
            @Override
            public void run() {
                productService.getPmsProduct();
            }
        };
        ExecutorService executorService = Executors.newFixedThreadPool(50);
        for (int i = 0; i < 10000; i++){
            executorService.submit(runnable);
        }
        return productService.getPmsProduct();
    };

}
