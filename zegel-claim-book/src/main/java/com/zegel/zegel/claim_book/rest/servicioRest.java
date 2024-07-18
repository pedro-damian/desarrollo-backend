package com.zegel.zegel.claim_book.rest;

import com.zegel.zegel.claim_book.entidades.ClaimBook;
import com.zegel.zegel.claim_book.negocio.ClaimBookNegocio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/zegel")
public class servicioRest {

    @Autowired
    private ClaimBookNegocio claimbooknegocio;

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
}
