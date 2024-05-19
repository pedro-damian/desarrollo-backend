package com.zegel.serviciosrestgestiontareas.rest;

import com.zegel.serviciosrestgestiontareas.entidades.Tareas;
import com.zegel.serviciosrestgestiontareas.negocio.TareaNegocio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

// definimos esta clase como @RestController
@RestController
// mapeamos la clase
@RequestMapping("/api")
public class TareasREST {

    @Autowired
    private TareaNegocio tareaNegocio;

    // mapeamos el POST y agregamos una ruta /tarea
    @PostMapping("/tarea")
    public Tareas grabar(@RequestBody Tareas tareas){
        return tareaNegocio.grabar(tareas);
    }

    @GetMapping("tareas")
    public List<Tareas> obtenertareas(){
        try {
            return tareaNegocio.obtenertareas();
        }
        catch (Exception e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No se puede obtener todos los tareas");
        }
    }
}
