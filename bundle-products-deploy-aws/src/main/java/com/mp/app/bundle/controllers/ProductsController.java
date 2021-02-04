package com.mp.app.bundle.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ProductsController {
    @GetMapping
    public String applicationstatus(){
        return "Application is up running";
    }

    @GetMapping("/{name}")
    public String welcome(@PathVariable String name){
        return "Hola Bienvenido: "+name;
    }

}
