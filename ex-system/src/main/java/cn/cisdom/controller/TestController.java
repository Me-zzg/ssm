package cn.cisdom.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaozhenguo
 * @Description TODO
 * @date 2019-04-11 17:24
 */
@RestController
public class TestController {

    @RequestMapping("/test1")
    public String test1(){
        return "访问的是 --》 Test1";
    }

    @RequestMapping("/test2")
    public String test2(){
        return "访问的是 --》 Test2";
    }
}