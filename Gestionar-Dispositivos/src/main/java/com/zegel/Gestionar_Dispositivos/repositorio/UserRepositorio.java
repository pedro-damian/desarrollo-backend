package com.zegel.Gestionar_Dispositivos.repositorio;

import com.zegel.Gestionar_Dispositivos.entidades.seguridad.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepositorio extends CrudRepository<User, Long> {

    // Buscar Usuario por el nombre y ya no por id
    User findByUsername(String username);
}
