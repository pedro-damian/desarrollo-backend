package com.zegel.Gestionar_Dispositivos.negocio;

import com.zegel.Gestionar_Dispositivos.entidades.Dispositivo;
import com.zegel.Gestionar_Dispositivos.repositorio.DispositivoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DispositivoNegocio {

    @Autowired
    private DispositivoRepositorio dispositivoRepositorio;

    //GRABAR
    @Transactional
    public Dispositivo grabar(Dispositivo dispositivo){
        return dispositivoRepositorio.save(dispositivo);
    }

    //LISTAR
    @Transactional
    public List<Dispositivo> listar(){
        return (List<Dispositivo>) dispositivoRepositorio.findAll();
    }

    //ACTUALIZAR
    @Transactional
    public Dispositivo actualizar(Dispositivo dispositivo){
        Dispositivo d = dispositivoRepositorio.findById(dispositivo.getId()).get();
        if(d!=null){
            return dispositivoRepositorio.save(dispositivo);
        }else {
            return null;
        }
    }

    //ELIMINAR
    @Transactional
    public Dispositivo eliminar(Long id){
        Dispositivo d = dispositivoRepositorio.findById(id).get();
        if(d!=null){
            dispositivoRepositorio.delete(d);
        }else {
            return null;
        }
        return d;
    }
}
