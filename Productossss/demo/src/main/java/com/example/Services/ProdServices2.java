package com.example.Services;

import com.example.entities.Productoentities;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;




	@Service
	public class ProdServices2 implements Productoservices{
	    private static final AtomicLong sequence = new AtomicLong();
	    private static final List<Productoentities> lista = new ArrayList<>(){{
	        add(new Productoentities(sequence.incrementAndGet(),"audifonos", "sony","bluetooth", 100));
	    }};

	    @Override
	    public List<Productoentities> listarProductos() {
	        return lista;
	    }

	    @Override
	    public Productoentities buscarProducto(Long id) {
	        for(Productoentities p : lista){
	            if(p.getId().equals(id)){
	                return p;
	            }
	        }
	        return null;
	    }

	    @Override
	    public void crearProducto(Productoentities producto) {
	        producto.setId(sequence.incrementAndGet());
	        lista.add(producto);
	    }

	    @Override
	    public void actualizarProducto(Productoentities producto) {
	        Long id = producto.getId();
	        Productoentities p = buscarProducto(id);
	        producto.setId(id);
	        lista.set(lista.indexOf(p), producto);
	    }

	    @Override
	    public void borrarProducto(Productoentities producto) {
	        lista.remove(producto);
	    }
	}



