package com.example.FormBasesecurityDemo.StudentSecurityConfiguration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/admin")
public class Studentcontroller {

    @GetMapping("/login")
    public String display(){
        return "This is home";
    }


}
