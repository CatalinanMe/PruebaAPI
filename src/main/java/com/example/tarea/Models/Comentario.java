package com.example.tarea.Models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Entity
@Table(name = "comentario-tarea")
public class Comentario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long comentarioId;

    @Column(name = "texto")
    @NotNull
    private String tareaTexto;

    private String tareaFechaDeCreacion;


    @ManyToOne
    @JoinColumn(name = "tarea_id", nullable = false)
    private Tarea tarea;



}
