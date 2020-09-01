package com.example.demo.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @authorzephyr
 * @date2020/8/1215:12
 */
@Controller
public class JspController {


    @GetMapping("/boot/index")
    public String jspDemo(Model model){
          model.addAttribute("msg", "spring-boot 集成 jsp 测试！");
//        model.addAttributes("msg", "spring-boot 集成 jsp 测试！");
        return "index";
    };
}
