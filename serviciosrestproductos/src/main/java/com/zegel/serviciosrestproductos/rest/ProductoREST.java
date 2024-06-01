package com.zegel.serviciosrestproductos.rest;

import com.zegel.serviciosrestproductos.entidades.Venta;
import com.zegel.serviciosrestproductos.negocio.VentaNegocio;
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

//    @Autowired
//    private productonegocio productoNegocio;

    @Autowired
    private VentaNegocio ventaNegocio;

//    @PostMapping("/producto")
//    public producto grabar(@RequestBody producto Producto) {
//        return productoNegocio.grabar(Producto);
//    }

//    @GetMapping("productos")
//    public List<producto> obtenerProductos() {
//        try {
//            return productoNegocio.obtenerProductos();
//        }
//        catch (Exception e){
//            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No es posible la conexion");
//        }
//    }


//    @PutMapping("/actualizar")
//    public producto actualizar(@RequestBody producto producto){
//        try {
//            return productoNegocio.actualizar(producto);
//        }
//        catch (Exception e) {
//            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No es posible actualizar");
//        }
//    }

    //@DeleteMapping("/producto/{codigo}")
    //public producto borrar(@PathVariable(value = "codigo") Long codigo){
        //return productoNegocio.borrar(codigo);
    //}

    //---------------- SECCION VENTAS ------------------------
    @PostMapping("/venta")
    public Venta grabar(@RequestBody Venta venta) {
        return ventaNegocio.grabar(venta);
    }


    @GetMapping("ventas")
    public List<Venta> obtener() {
        try {
            return ventaNegocio.obtenerventas();
        }
        catch (Exception e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No es posible la conexion");
        }
    }

    @PutMapping("/actualizar")
    public Venta actualizar(@RequestBody Venta venta){
        try {
            return ventaNegocio.actualizar(venta);
        }
        catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No es posible actualizar");
        }
    }


    @DeleteMapping("/venta/{nroVenta}")
    public Venta borrar(@PathVariable(value = "nroVenta") Long nroVenta){
        return ventaNegocio.borrar(nroVenta);
    }

}
