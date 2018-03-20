package com.example.springbootdemo.webcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class WebController {
    /**
     * 首页
     * @return
     */
    @RequestMapping("/")
    public String page(ModelMap map){
        map.put("title", "hello world");
        return "index";
    }




}
