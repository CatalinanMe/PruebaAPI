package com.example.tarea.Services;

import com.example.tarea.Models.Tarea;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class TareaServiceImpl implements TareaService {

    @Override
    public Tarea crearTarea(Tarea nuevaTarea) {
        return null;
    }

    @Override
    public List<Tarea> listaDeTareas() {
        return null;
    }

    @Override
    public Tarea guardarTarea(Tarea nuevaTarea) {
        return null;
    }
}