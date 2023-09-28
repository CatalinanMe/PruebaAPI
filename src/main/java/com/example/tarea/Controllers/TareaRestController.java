package com.example.tarea.Controllers;

import com.example.tarea.Models.Tarea;
import com.example.tarea.Services.TareaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarea")
public class TareaRestController {

    @Autowired
    TareaServiceImpl tareaService;

    @PostMapping("/nuevo")
    public Tarea nuevaTarea(@RequestBody Tarea nuevaTarea) { return tareaService.guardarTarea(nuevaTarea); }

    @GetMapping("/lista")
    public List<Tarea> enlistarTareas() { return  tareaService.listaDeTareas();}

}