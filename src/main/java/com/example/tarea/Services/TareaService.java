package com.example.tarea.Services;

import com.example.tarea.Models.Tarea;
import jakarta.persistence.Entity;
import org.springframework.stereotype.Service;

import java.util.List;

public interface TareaService {

    Tarea crearTarea(Tarea nuevaTarea);

    List<Tarea> listaDeTareas();

    Tarea guardarTarea(Tarea nuevaTarea);
}