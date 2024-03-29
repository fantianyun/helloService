package com.fty.helloService.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
public class ConsumerController {
    @Autowired
    RestTemplate restTemplate;
    @RequestMapping(value = "/hello-consumer",method = RequestMethod.GET)
    public String  helloConsumer(){
        return  restTemplate.getForEntity("http://hello-service:4444/hello",String.class).getBody();
       // return  "13444";
    }
}
