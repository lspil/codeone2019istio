package com.laurentiuspilca.istiodemo1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/version")
    public String version() {
        return "Version 2";
    }
}
