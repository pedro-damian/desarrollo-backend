package com.zegel.serviciosrestproductos.repositorio;

import com.zegel.serviciosrestproductos.entidades.producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

// agregamos al metodo extends CrudRepository para importar la libreria
// definimos dentro de signos de mayor y menor la clase producto y el tipo de dato con la primary key
public interface productorepositorio extends CrudRepository<producto,Long> {
    @Query(value = "CALL obtener_producto_mayor_precio()", nativeQuery = true)
    producto obtenerProductoMayorPrecio();

}
