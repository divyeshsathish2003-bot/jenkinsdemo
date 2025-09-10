package com.ey;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping
    public String home() {
        return "Welcome Home";
    }
    
    
    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome page";
    }
}
