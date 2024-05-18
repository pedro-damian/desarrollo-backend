package com.zegel.serviciosrestgestiontareas.repositorio;

import com.zegel.serviciosrestgestiontareas.entidades.Tareas;
import org.springframework.data.repository.CrudRepository;

public interface TareaRepositorio extends CrudRepository<Tareas,Long> {
}
