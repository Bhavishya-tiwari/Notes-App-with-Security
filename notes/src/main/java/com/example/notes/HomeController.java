package com.example.notes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/hello")
    String home(){

        return "Hello";
    }

    @GetMapping("/contact")
    String sayContact(){
        return "Contact";
    }
}

