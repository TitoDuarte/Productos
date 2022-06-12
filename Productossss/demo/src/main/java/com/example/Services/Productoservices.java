package com.example.Services;

import com.example.entities.Productoentities;

import java.util.List;

public interface Productoservices {
    List<Productoentities> listarProductos();
    Productoentities buscarProducto(Long id);
    void crearProducto(Productoentities producto);
    void actualizarProducto(Productoentities producto);
    void borrarProducto(Productoentities producto);
}
