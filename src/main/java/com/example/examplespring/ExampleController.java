package com.example.examplespring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {
    @RequestMapping("/zahir")
    public String index(){
        return "Hello Zahir!";
    }

    @RequestMapping("/elshan")
    public String index2(){
        return "Hello Elshan";
    }
}
