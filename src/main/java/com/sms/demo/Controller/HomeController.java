package com.sms.demo.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        System.err.println("Home Controller");
        return "home1.html"; // Assuming your HTML file is named home1.html
    }
   
}
