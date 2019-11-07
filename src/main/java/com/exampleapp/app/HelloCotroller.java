package com.exampleapp.app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;

@RestController
public class HelloCotroller
{
    @RequestMapping("/hello")
    public String hallo(){
        return"Hello, time is" + LocalDateTime.now();
    }



}
