package com.zegel.serviciosrestproductos.entidades;


import jakarta.persistence.*;

//notacion @Entity sirve para importar la libreria Entity
@Entity

// Define el nombre de la tabla, que debe estar creado en mysql
@Table(name= "TP_PRODUCTO")
public class producto {

    @Id
    // ID se va autogenerar
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    // METODOS PRIVADOS
    private Long codigo;
    private String descripcion;
    private double precio;

    // aqui para generar los metodos publicos con getter and setter click derecho y generate

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


}
