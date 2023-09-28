package com.example.tarea.Services;

import com.example.tarea.Models.Comentario;

import java.util.List;


public interface ComentarioService {

    Comentario guardarComentario(Comentario nuevoComentario);

    List<Comentario> listaDeComentarios();

    Comentario crearComentario(Comentario nuevoComentario);
}