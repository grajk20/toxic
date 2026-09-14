package com.raj.toxic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InitialToxicController {

    @GetMapping("/init")
    public String InitialToxicControllerInit() {

        System.out.println("Raj Gowda - Init Controller");

        return "Raj Gowda : Init";

    }
}
