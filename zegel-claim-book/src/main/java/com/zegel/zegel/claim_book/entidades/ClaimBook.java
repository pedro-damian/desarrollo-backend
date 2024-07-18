package com.zegel.zegel.claim_book.entidades;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class ClaimBook {

    // anotacion que genera los id automatomaticamente
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClaim;
    private boolean tipo;
    // anotacion genera automaticamente la fecha actual del sistema
    @Temporal(TemporalType.DATE)
    private Date fecha_reclamo;
    private String nombres;
    private String apellidos;
    private String correo;
    private String telefono;
    private String pais;
    private String ciudad;
    private String direccion;
    private String tipo_identificacion;
    private String detalle_reclamo;

    public Long getIdClaim() {
        return idClaim;
    }

    public void setIdClaim(Long idClaim) {
        this.idClaim = idClaim;
    }

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

    public Date getFecha_reclamo() {
        return fecha_reclamo;
    }

    public void setFecha_reclamo(Date fecha_reclamo) {
        this.fecha_reclamo = fecha_reclamo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipo_identificacion() {
        return tipo_identificacion;
    }

    public void setTipo_identificacion(String tipo_identificacion) {
        this.tipo_identificacion = tipo_identificacion;
    }

    public String getDetalle_reclamo() {
        return detalle_reclamo;
    }

    public void setDetalle_reclamo(String detalle_reclamo) {
        this.detalle_reclamo = detalle_reclamo;
    }
}
