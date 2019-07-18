package com.fty.helloService.Controller;

import com.fty.helloService.pojo.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        return  "Hello-Service";
    }

    @RequestMapping(value = "/hello1")
    public String hello(@RequestParam String name){
        return "Hello" + name;
    }

    @RequestMapping(value = "/hello2")
    public User hello(@RequestHeader String name,@RequestHeader Integer age){
        return new User(name,age);
    }

    @RequestMapping(value = "/hello3",method = RequestMethod.POST)
    public String hello(@RequestBody User user){
        return "Hello" + user.getName() + "," + user.getAge();
    }
}
