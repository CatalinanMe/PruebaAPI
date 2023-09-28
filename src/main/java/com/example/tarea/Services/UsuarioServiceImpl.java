package com.example.tarea.Services;

import com.example.tarea.Repositories.ComentarioRepository;
import com.example.tarea.Repositories.TareaRepository;
import com.example.tarea.Repositories.UsuarioRepository;
import com.example.tarea.Models.Usuario;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;


    //LISTA de los registros
    @Override
    public List<Usuario> listaDeUsuarios() {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario buscarUsuarioPorId(Long id) {
        boolean existe = usuarioRepository.existsById(id);

        if (existe) {
            Usuario usuarioElegido = usuarioRepository.findById(id).get();
            return usuarioElegido;
        } else {
            System.out.println("el id no existe");
            return null;
        }
    }

    @Override
    public Usuario guardarUsuario(Usuario nuevoUsuario) {
        if (nuevoUsuario.getUsuarioEdad() < 18) {
            System.out.println("El usuario debe ser mayor a 18 años");
            return null;
        } else {
            return usuarioRepository.save(nuevoUsuario);
        }
    }


    @Override
    public void borrarUsuario(Long id) { usuarioRepository.deleteById(id); }

    @Override
    public Usuario editarUsuarioPorId(Long id, Usuario usuarioActualizado) {
        boolean existe = usuarioRepository.existsById(id);

        if (existe) {
            Usuario usuarioSeleccionado = usuarioRepository.findById(id).get();
            usuarioSeleccionado.setUsuarioEdad(usuarioActualizado.getUsuarioEdad());
            usuarioSeleccionado.setUsuarioNombre(usuarioActualizado.getUsuarioNombre());
            usuarioSeleccionado.setEmail(usuarioActualizado.getEmail());
            System.out.println("El usuario ha sido actualizado");
            return usuarioRepository.save(usuarioSeleccionado);
        } else {
            System.out.println("Usuario no encontrado");
            return null;
        }
    }

    @Override
    public Usuario buscarUsuarioPorNombre(String nombre) {
        return null;
    }

}