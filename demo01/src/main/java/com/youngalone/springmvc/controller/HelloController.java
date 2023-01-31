package com.youngalone.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author youngalone
 * @create 2023-01-30 17:48
 * @Describe
 */
@Controller
public class HelloController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
