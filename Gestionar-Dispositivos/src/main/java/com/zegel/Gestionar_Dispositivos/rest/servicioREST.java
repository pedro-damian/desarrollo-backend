package com.zegel.Gestionar_Dispositivos.rest;

import com.zegel.Gestionar_Dispositivos.entidades.Dispositivo;
import com.zegel.Gestionar_Dispositivos.negocio.DispositivoNegocio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/zegel")
public class servicioREST {

    @Autowired
    private DispositivoNegocio dispositivoNegocio;

    //POST
    @PostMapping("/devices")
    public Dispositivo grabar(@RequestBody Dispositivo dispositivo){
        return dispositivoNegocio.grabar(dispositivo);
    }

    //GET
    @GetMapping("/devices")
    public List<Dispositivo> listar(){
        try {
            return dispositivoNegocio.listar();
        }catch (Exception e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "NO ES POSIBLE OBTENER LOS DATOS");
        }
    }

    //PUT
    @PutMapping("/devices")
    public Dispositivo actualizar(@RequestBody Dispositivo dispositivo){
        try {
            return dispositivoNegocio.actualizar(dispositivo);
        }catch (Exception e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "NO ES POSIBLE ACTUALIZAR LOS DATOS");
        }
    }

    //DELETE
    @DeleteMapping("/devices/{id}")
    public Dispositivo eliminar(@PathVariable(value = "id") Long id){
        return dispositivoNegocio.eliminar(id);
    }
}
