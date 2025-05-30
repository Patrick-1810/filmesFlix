package com.catalogo.backend.service;

import com.catalogo.backend.model.Filmes;
import com.catalogo.backend.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmesService {

    @Autowired
    private FilmeRepository filmeRepository;

    public List<Filmes> getAllFilmes() {
        return filmeRepository.findAll();
    }

    public Filmes getFilmeById(long id) {
        return filmeRepository.findById(id).orElse(null);
    }

    public List<Filmes> getFilmesByGenero(String genero) {
        return filmeRepository.findByGenero(genero);
    }

    public List<Filmes> getFilmesByNome(String nome) {
        return filmeRepository.findByNome(nome);
    }

    public Filmes saveFilme(Filmes filme) {
        return filmeRepository.save(filme);
    }

    public void deleteFilme(long id) {
        filmeRepository.deleteById(id);
    }

}
