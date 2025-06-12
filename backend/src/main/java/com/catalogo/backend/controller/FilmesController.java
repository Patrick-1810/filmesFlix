package com.catalogo.backend.controller;

import com.catalogo.backend.model.Filmes;
import com.catalogo.backend.service.FilmesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/filmes")
public class FilmesController {

    @Autowired
    private FilmesService filmesService;

    @GetMapping
    public List<Filmes> listarFilmes() {
        return filmesService.getAllFilmes();
    }

    @GetMapping("/genero/{genero}")
    public List<Filmes> getFilmesByGenero(@PathVariable String genero) {
        return filmesService.getFilmesByGenero(genero);
    }

    @GetMapping("/nome/{nome}")
    public List<Filmes> getFilmesByNome(@PathVariable String nome) {
        return filmesService.getFilmesByNome(nome);
    }

    @GetMapping("/{id}")
    public Filmes getFilmeById(@PathVariable long id) {
        return filmesService.getFilmeById(id);
    }

    @PostMapping
    public Filmes createFilme(@RequestBody Filmes filme) {
        return filmesService.saveFilme(filme);
    }

    @DeleteMapping("/{id}")
    public void deleteFilme(@PathVariable long id) {
        filmesService.deleteFilme(id);
    }
}
