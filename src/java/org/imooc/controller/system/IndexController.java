package org.imooc.controller.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/9/10.
 */
@Controller
@RequestMapping("/index")
public class IndexController {
    @RequestMapping
    public String init(){
        return "system/index";
    }
}
