package com.catalogo.backend.model;

import jakarta.persistence.*;

@Entity
public class Avaliacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String autor;
    private String comentario;
    private int avaliacao; 

    @ManyToOne
    @JoinColumn(name = "filme_id")
    private Filme filme;

  
    public Avaliacao() {
    }


    public Avaliacao(String autor, String comentario, int avaliacao, Filme filme) {
        this.autor = autor;
        this.comentario = comentario;
        this.avaliacao = avaliacao;
        this.filme = filme;
    }

  
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    public String getComentario() { return comentario; }
    public void setComentario(String comentario) { this.comentario = comentario; }

    public int getAvaliacao() { return avaliacao; }
    public void setAvaliacao(int avaliacao) { this.avaliacao = avaliacao; }

    public Filme getFilme() { return filme; }
    public void setFilme(Filme filme) { this.filme = filme; }
}
