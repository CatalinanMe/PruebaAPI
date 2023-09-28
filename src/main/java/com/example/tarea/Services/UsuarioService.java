package com.example.tarea.Services;

import com.example.tarea.Models.Usuario;

import java.util.List;

public interface UsuarioService {

    List<Usuario> listaDeUsuarios();

    Usuario buscarUsuarioPorId(Long id);

    Usuario guardarUsuario(Usuario nuevoUsuario);

    void borrarUsuario(Long id);

    Usuario editarUsuarioPorId(Long id, Usuario UsuarioActualizado);

    Usuario buscarUsuarioPorNombre(String nombre);
}
