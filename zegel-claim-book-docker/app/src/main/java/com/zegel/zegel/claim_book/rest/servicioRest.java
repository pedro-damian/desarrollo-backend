package com.zegel.zegel.claim_book.rest;

import com.zegel.zegel.claim_book.entidades.ClaimBook;
import com.zegel.zegel.claim_book.entidades.seguridad.User;
import com.zegel.zegel.claim_book.negocio.ClaimBookNegocio;
import com.zegel.zegel.claim_book.negocio.UserNegocio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/zegel")
public class servicioRest {

    @Autowired
    private ClaimBookNegocio claimbooknegocio;

    @Autowired
    private UserNegocio userNegocio;

    @PostMapping("/claimbook")
    public ClaimBook grabar(@RequestBody ClaimBook claimbook){
        return claimbooknegocio.grabar(claimbook);
    }

    @GetMapping("/claimbooks")
    public List<ClaimBook> obtenerproductos(){
        try {
            return claimbooknegocio.obtenerlista();
        }
        catch (Exception e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "NO ES POSIBLE OBTENER LOS DATOS");
        }
    }

    @PutMapping("/actualizar")
    public ClaimBook actualizar(@RequestBody ClaimBook claimbook) {
        try {
            return claimbooknegocio.actualizar(claimbook);
        }
        catch (Exception e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "NO ES POSIBLE ACTUALIZAR");
        }
    }

    @DeleteMapping("/claimbook/{idClaim}")
    public ClaimBook eliminar(@PathVariable(value ="idClaim") Long idClaim){
        return claimbooknegocio.eliminar(idClaim);
    }

    // User

    @PostMapping("/api/users")
    public ResponseEntity<String> createUser(@RequestBody User user) {
        User newUser = userNegocio.grabar(user);
        return ResponseEntity.ok("User created successfully with id: " + newUser.getId());
    }

    @GetMapping("/api/users")
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = userNegocio.obtenerUsuarios();
        return ResponseEntity.ok(users);
    }
}
