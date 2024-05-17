package com.zegel.serviciosrestproductos.entidades;

import jakarta.persistence.*;

@Entity
public class producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    private String descripcion;
    private double precio;

    public Long getcodigo(){
        return codigo;
    }

    public void setcodigo(Long codigo){
        this.codigo = codigo;
    }

}
