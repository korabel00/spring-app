package com.solovev.spring_mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class SecondController {

    @GetMapping("/exit")
    public String exitPage() {
        return "second/exit";
    }
}