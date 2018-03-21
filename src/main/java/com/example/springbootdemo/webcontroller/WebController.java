package com.example.springbootdemo.webcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
    /**
     * 首页
     * @return
     */
    @GetMapping("/index")
    public String index(){
        return "index"; //当浏览器输入/index时，会返回 /static/index.html的页面
    }




}
