package com.zegel.serviciosrestproductos.negocio;

import com.zegel.serviciosrestproductos.entidades.Venta;
import com.zegel.serviciosrestproductos.repositorio.VentaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class VentaNegocio {

    @Autowired
    private VentaRepositorio ventarepositorio;

    // permite que la transacciones puedan realizar rollback
    @Transactional
    public Venta grabar(Venta venta){
        return  ventarepositorio.save(venta);
    }

    @Transactional(readOnly = true)
    public List<Venta> obtenerventas(){
        return (List<Venta>) ventarepositorio.findAll();
    }

    @Transactional
    public Venta actualizar(Venta venta){
        Venta v = ventarepositorio.findById(venta.getNroVenta()).get();

        if(v!=null){
            return ventarepositorio.save(venta);
        }else {
            return null;
        }
    }

    @Transactional
    public Venta borrar(Long nroVenta) {
        Venta venta = ventarepositorio.findById(nroVenta).get();

        if (venta!=null){
            ventarepositorio.delete(venta);
        }
        return venta;
    }

}
