package cn.dceast.platform.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author liuyd
 * @date 2017/7/27.
 */
@Controller
public class HelloController {
    @RequestMapping("/hello.do")
    public String hello(){
        return "hello/hello";
    }
}
