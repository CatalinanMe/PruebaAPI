package com.example.tarea.Controllers;

import com.example.tarea.Models.Comentario;
import com.example.tarea.Services.ComentarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comentario")
public class ComentarioRestController {

    @Autowired
    ComentarioServiceImpl comentarioService;

    @PostMapping("/nuevo")
    public Comentario crearComentario(@RequestBody Comentario nuevoComentario) { return  comentarioService.crearComentario(nuevoComentario);}

    @GetMapping("/lista")
    public List<Comentario> enlistarComentarios() { return comentarioService.listaDeComentarios();}

}