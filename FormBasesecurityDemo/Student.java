package com.example.FormBasesecurityDemo;


import com.example.FormBasesecurityDemo.StudentSecurityConfiguration.Studentcontroller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Student")
public class Student {



    @GetMapping("/hello")
    public String display(){
        return "Hello method";
    }
    @GetMapping("/hi")
    public String print(){
        return "Hi method";
    }
    @GetMapping("/unsuccess")
    public String displaymsg(){
        return "Failure";
    }






}
