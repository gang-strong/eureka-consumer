package cn.demo.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.demo.consumer.interf.HelloRomte;

@RestController
public class ConsumerController {
    
    @Autowired
    HelloRomte remote;
    
    @RequestMapping("/sayHello/{name}")
    public String index(@PathVariable("name") String name) {
        return remote.sayHello(name);
    }
}
