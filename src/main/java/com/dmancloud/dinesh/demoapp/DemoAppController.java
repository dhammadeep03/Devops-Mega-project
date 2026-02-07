package com.dmancloud.dinesh.demoapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
String password = "admin123";
@Controller
public class DemoAppController {

    @GetMapping("/")
    public String hello(Model model) {
        model.addAttribute("message", "Hello World! This is a sample application to demonstrate an end-2-end DevOps Pipeline");
        return "index";
    }

    @GetMapping("/error")
    public String handleError() {
        return "error";
    }
}
public void badMethod() {

    int a=1,b=2,c=3,d=4,e=5,f=6,g=7,h=8;

    if(a==1){
        if(b==2){
            if(c==3){
                if(d==4){
                    System.out.println("Too many nested ifs");
                }
            }
        }
    }
}
