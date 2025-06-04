package com.catalogo.backend.model;

import jakarta.persistence.*;

@Entity
public class Favoritos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long usuarioId;  
    private Long filmeId;

    public Favoritos() {}

    public Favoritos(Long usuarioId, Long filmeId) {
        this.usuarioId = usuarioId;
        this.filmeId = filmeId;
    }


    public Long getId() {
        return id;
    }

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Long getFilmeId() {
        return filmeId;
    }

    public void setFilmeId(Long filmeId) {
        this.filmeId = filmeId;
    }
}
