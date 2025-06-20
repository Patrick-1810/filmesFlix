package com.catalogo.backend.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.catalogo.backend.model.Favoritos;
import com.catalogo.backend.service.FavoritosService;

@RestController
@RequestMapping("/api/favoritos")
@CrossOrigin(origins = "*")
public class FavoritosController {

    @Autowired
    private FavoritosService favoritosService;


    @PostMapping
    public Favoritos addFavorito(@RequestParam Long filmeId) {
        return favoritosService.addFavorito(filmeId);
    }

    @DeleteMapping
    public void removerFavorito( @RequestParam Long filmeId) {
        favoritosService.removerFavorito(filmeId);
    }
}
