package com.forezp.serviceribbon.controller;

import com.forezp.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: chengmr
 * @Date: 2020/6/23 11:26
 * @Description:
 */
@RestController
public class HelloControler {
    @Autowired
    HelloService helloService;

    @RequestMapping("/hi")
    public String hi(String name){
        return helloService.hiService(name);
    }
}
