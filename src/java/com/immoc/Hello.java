package com.immoc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
/**
 * Created by Administrator on 2017/9/9.
 */
public class Hello {
    @RequestMapping("/helloworld")
    public String hello(){
        System.out.println("hello world");
        return "index";
    }
}
