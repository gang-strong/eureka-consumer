package cn.demo.consumer.interf;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "eureka-producer")
public interface HelloRomte {

    @RequestMapping(value = "/hello")
    public String sayHello(@RequestParam(value = "name")String name);
}
