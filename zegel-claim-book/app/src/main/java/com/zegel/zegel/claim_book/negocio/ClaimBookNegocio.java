package com.zegel.zegel.claim_book.negocio;

import com.zegel.zegel.claim_book.entidades.ClaimBook;
import com.zegel.zegel.claim_book.repositorio.ClaimBookRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClaimBookNegocio {
    @Autowired
    private ClaimBookRepositorio claimbookrepositorio;

    // guardar
    public ClaimBook grabar(ClaimBook claimbook){
        return claimbookrepositorio.save(claimbook);
    }

    // listar
    public List<ClaimBook> obtenerlista(){
        return (List<ClaimBook>) claimbookrepositorio.findAll();
    }

    // actualizar
    public ClaimBook actualizar(ClaimBook claimbook){
        ClaimBook c = claimbookrepositorio.findById(claimbook.getIdClaim()).get();
        if(c!= null){
            return claimbookrepositorio.save(claimbook);
        } else {
            return null;
        }
    }

    // eliminar
    public ClaimBook eliminar(Long idClaim){
        ClaimBook c = claimbookrepositorio.findById(idClaim).get();
        if(c!= null){
            claimbookrepositorio.delete(c);
        } else {
            return null;
        }
        return c;
    }
}
