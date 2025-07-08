package com.mySpringCRUDProject.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String homeText(){
        return "Heyyyy Welcome user";
    }

    @GetMapping("/about")
    public String aboutThisProject(){
        String s = "this is my first project , hope you will like it";
        return s.toUpperCase();
    }

}
