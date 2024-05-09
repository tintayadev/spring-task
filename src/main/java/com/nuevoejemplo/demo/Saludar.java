package com.nuevoejemplo.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/start")
public class Saludar {
    @GetMapping("/hola")
    public String hola() {
        return "Hola mundo ;D";
    }
    //@GetMapping("")
}
