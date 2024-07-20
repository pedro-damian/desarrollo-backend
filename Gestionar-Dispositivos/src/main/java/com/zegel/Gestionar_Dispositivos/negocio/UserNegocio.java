package com.zegel.Gestionar_Dispositivos.negocio;

import com.zegel.Gestionar_Dispositivos.entidades.seguridad.User;
import com.zegel.Gestionar_Dispositivos.repositorio.UserRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserNegocio {

    @Autowired
    private UserRepositorio userRepositorio;

    @Autowired
    private PasswordEncoder passwordEncoder;

    //GRABAR
    public User grabar(User user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepositorio.save(user);
    }

    //LISTAR
    public List<User> obtenerUsuarios(){
        return (List<User>) userRepositorio.findAll();
    }

    //ACTUALIZAR
    public User actualizar(User user){
        if(userRepositorio.existsById(user.getId())){
            return userRepositorio.save(user);
        }else {
            return null;
        }
    }

    // BORRAR
    public User borrarUsuario(Long id){
        User user = userRepositorio.findById(id).orElse(null);
        if(user != null){
            userRepositorio.delete(user);
        }
        return user;
    }

    // BUSCAR ID
    public User buscarPorId(Long id) {
        return userRepositorio.findById(id).orElse(null);
    }

    // BUSCAR USUARIO
    public User buscarPorUsername(String username) {
        return userRepositorio.findByUsername(username);
    }
}
