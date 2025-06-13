package com.catalogo.backend.controller;

import java.util.List;

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

    @GetMapping("/usuario/{usuarioId}")
    public List<Favoritos> getFavoritosByUsuarioId(@PathVariable Long usuarioId) {
        return favoritosService.getFavoritosByUsuarioId(usuarioId);
    }

    @PostMapping
    public Favoritos addFavorito(@RequestParam Long usuarioId, @RequestParam Long filmeId) {
        return favoritosService.addFavorito(usuarioId, filmeId);
    }

    @DeleteMapping
    public void removerFavorito(@RequestParam Long usuarioId, @RequestParam Long filmeId) {
        favoritosService.removerFavorito(usuarioId, filmeId);
    }
}
