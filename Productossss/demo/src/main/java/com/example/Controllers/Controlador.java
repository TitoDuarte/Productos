package com.example.Controllers;

import com.example.entities.Productoentities;
import com.example.Services.ProdServices2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class Controlador {

    @Autowired
    ProdServices2 productoService;

    @GetMapping
    public List<Productoentities> listarProducto(){
        return productoService.listarProductos();
    }

    @GetMapping("/{id}")
    public Productoentities buscarProducto(@PathVariable Long id){
        return productoService.buscarProducto(id);
    }

    @PostMapping
    public void crearProducto(@RequestBody Productoentities producto){
        productoService.crearProducto(producto);
    }

    @PutMapping
    public void actualizarProducto(@RequestBody Productoentities producto){
        productoService.actualizarProducto(producto);
    }

    @DeleteMapping
    public void borrarProducto(@RequestBody Productoentities producto){
        productoService.borrarProducto(producto);
    }
}

