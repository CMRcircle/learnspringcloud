package com.example.servicehystrixfeign.service.impl;

import com.example.servicehystrixfeign.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * @Auther: chengmr
 * @Date: 2020/6/23 15:22
 * @Description:
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry"+name;
    }
}
