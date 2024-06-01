package com.zegel.serviciosrestproductos.negocio;

import com.zegel.serviciosrestproductos.entidades.Venta;
import com.zegel.serviciosrestproductos.entidades.producto;
import com.zegel.serviciosrestproductos.repositorio.VentaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VentaNegocio {

    @Autowired

    private VentaRepositorio ventarepositorio;

    // CRUD

    // grabar
    public Venta grabar(Venta venta){
        return  ventarepositorio.save(venta);
    }

    // listar
    public List<Venta> obtenerventas(){
        return (List<Venta>) ventarepositorio.findAll();
    }


    public Venta actualizar(Venta venta){
        Venta v = ventarepositorio.findById(venta.getNroVenta()).get();

        if(v!=null){
            return ventarepositorio.save(venta);
        }else {
            return null;
        }
    }


    public Venta borrar(Long nroVenta) {
        Venta venta = ventarepositorio.findById(nroVenta).get();

        if (venta!=null){
            ventarepositorio.delete(venta);
        }
        return venta;
    }

}
