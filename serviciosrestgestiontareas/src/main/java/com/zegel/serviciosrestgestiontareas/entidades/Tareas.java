package com.zegel.serviciosrestgestiontareas.entidades;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Tareas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Enumerated(EnumType.STRING)
    private Long id;
    private String Titulo;
    private String Descripcion;
    private LocalDate Vencimiento;
    private TaskStatus estado;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public LocalDate getVencimiento() {
        return Vencimiento;
    }

    public void setVencimiento(LocalDate vencimiento) {
        Vencimiento = vencimiento;
    }

    public TaskStatus getEstado() {
        return estado;
    }

    public void setEstado(TaskStatus estado) {
        this.estado = estado;
    }
}

