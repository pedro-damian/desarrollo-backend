package com.zegel.serviciosrestgestiontareas.negocio;

import com.zegel.serviciosrestgestiontareas.entidades.Tareas;
import com.zegel.serviciosrestgestiontareas.repositorio.TareaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TareaNegocio {
    @Autowired
    private TareaRepositorio tarearepositorio;

    public Tareas grabar(Tareas tareas){
        return tarearepositorio.save(tareas);
    }

    public List<Tareas> obtenertareas(){
        return (List<Tareas>) tarearepositorio.findAll();
    }
}
