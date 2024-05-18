package com.zegel.serviciosrestproductos.negocio;


import com.zegel.serviciosrestproductos.entidades.producto;
import com.zegel.serviciosrestproductos.repositorio.productorepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//notacion @service sirve para importar la libreria service
@Service
public class productonegocio {

    //notacion @Autowired sirve para importar la libreria Autowired
    @Autowired

    // definir dependencias
    private productorepositorio productoRepositorio;

    //-------------------------- CRUD --------------------

    // Grabar esto insertara los datos en la tabla
    public producto grabar(producto producto) {
        return productoRepositorio.save(producto);
    }
    // Listar mostrara todos los datos insertados
    public List<producto> obtenerProductos() {
        return (List<producto>) productoRepositorio.findAll();
    }

}
