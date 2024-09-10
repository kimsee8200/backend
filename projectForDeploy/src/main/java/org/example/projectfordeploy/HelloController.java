package org.example.projectfordeploy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String hello() {
        return "Hello World 1917-2024";
    }

    @PostMapping("/insert")
    public EasyData insert(EasyData data) {
        return data;
    }
}
