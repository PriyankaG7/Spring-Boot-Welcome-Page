package com.example.welcomepage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "welcome";  // Returns welcome.html in src/main/resources/templates
    }
}
