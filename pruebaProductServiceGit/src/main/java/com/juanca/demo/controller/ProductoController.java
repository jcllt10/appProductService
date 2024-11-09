package com.juanca.demo.controller;

import com.juanca.demo.controller.entity.Producto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductoController {
    
    @RequestMapping("inicio")
    public String index()
    {
       Producto nuevoProducto =  new Producto();
        
       nuevoProducto.setId(1L);
       nuevoProducto.setName("plancha");
       nuevoProducto.setPrecio(12.5);
       
       return "inicio";
    }
    
    
}
