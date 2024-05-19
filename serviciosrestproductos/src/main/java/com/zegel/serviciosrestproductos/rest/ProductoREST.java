package com.zegel.serviciosrestproductos.rest;

import com.zegel.serviciosrestproductos.negocio.productonegocio;
import com.zegel.serviciosrestproductos.entidades.producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api")

public class ProductoREST {

    @Autowired
    private productonegocio productoNegocio;

    @PostMapping("/producto")
    public producto grabar(@RequestBody producto Producto) {
        return productoNegocio.grabar(Producto);
    }

    @GetMapping("productos")
    public List<producto> obtenerProductos() {
        try {
            return productoNegocio.obtenerProductos();
        }
        catch (Exception e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No es posible la conexion");
        }
    }

}
