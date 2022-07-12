package com.example.testlog;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

    @GetMapping("test")
    public String getTest(@RequestParam("a") String a) {
        return "Hello " + a;
    }
}
