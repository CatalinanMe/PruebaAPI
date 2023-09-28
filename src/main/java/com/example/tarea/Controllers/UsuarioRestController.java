package com.example.tarea.Controllers;


import com.example.tarea.Models.Usuario;
import com.example.tarea.Services.UsuarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioRestController {

    @Autowired
    UsuarioServiceImpl usuarioService;


    @GetMapping("/lista")
    public List<Usuario> usuarioList() {
        List<Usuario> listaMostrar = usuarioService.listaDeUsuarios();
        return listaMostrar;
    }

    //Buscar x Id
    @GetMapping("/usuario/{id}")
    public Usuario usuarioPorId(@PathVariable Long id) {
        Usuario usuarioMostrar = usuarioService.buscarUsuarioPorId(id);
        return usuarioMostrar;
    }

    //Crear nuevo usuario
    @PostMapping("/nuevo")
    public Usuario guardarNuevoUsuario (@RequestBody Usuario usuarioNuevo) {
        Usuario usuarioParaGuardar = usuarioService.guardarUsuario(usuarioNuevo);
        return usuarioParaGuardar;
    }

    //Para borrar
    @DeleteMapping("/borrar")
    public String borrarUsuarioPorId(@RequestParam Long id) {
        usuarioService.borrarUsuario(id);
        return "El usuario ha sido borrado";
    }

    //Para editar
    @PutMapping("/editar/{id}")
    public Usuario editarUsuarioPorId(@PathVariable Long id,
                                      @RequestBody Usuario usuarioActualizado) {
        Usuario usuarioEditado = usuarioService.editarUsuarioPorId(id, usuarioActualizado);
        return usuarioEditado;
    }

    //Para traer un usuario por nombre
    @GetMapping("/usuario/nombre/{nombre}")
    public Usuario buscarPorNombre(@PathVariable String nombre) {
        Usuario usuarioElegido = usuarioService.buscarUsuarioPorNombre(nombre);
        System.out.println(usuarioElegido);
        return usuarioElegido;
    }


}
