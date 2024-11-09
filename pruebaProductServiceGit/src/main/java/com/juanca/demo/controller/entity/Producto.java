package com.juanca.demo.controller.entity;

public class Producto {
    
    private Long id;
    private String name;
    private Double precio;

    public Producto() {
    }
    
    public Producto(Long id, String name, Double precio) {
        this.id = id;
        this.name = name;
        this.precio = precio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    
}
