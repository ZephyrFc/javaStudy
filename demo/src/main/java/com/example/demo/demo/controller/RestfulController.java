package com.example.demo.demo.controller;

import com.example.demo.demo.model.PmsProduct;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @authorzephyr
 * @date2020/8/1312:06
 */
@RestController
public class RestfulController {



    @RequestMapping("/boot/rest/{id}")
    public Object  restDemo(@PathVariable("id") Long id){
        PmsProduct product = new PmsProduct();
        product.setBrandId(id);
        return product;
    };

}
