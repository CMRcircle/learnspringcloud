package com.example.servicehystrixfeign.controller;

import com.example.servicehystrixfeign.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: chengmr
 * @Date: 2020/6/23 14:43
 * @Description:
 */
@RestController
public class HiController {
    //编译器报错，无视。 因为这个Bean是在程序启动的时候注入的，编译器感知不到，所以报错。
    @Autowired
    SchedualServiceHi schedualServiceHi;

    @RequestMapping("/hello")
    public String sayHi(@RequestParam String name){
        return schedualServiceHi.sayHiFromClientOne(name);

    }
}
