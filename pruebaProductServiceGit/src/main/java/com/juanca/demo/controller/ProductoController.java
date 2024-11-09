package com.juanca.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductoController {
    
    @RequestMapping("inicio")
    public String index()
    {
       return "inicio";
    }
    
    
}
