package com.zegel.Gestionar_Dispositivos.entidades.seguridad;

public class JwtResponse {

    private final String token;

    public JwtResponse(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }
}
