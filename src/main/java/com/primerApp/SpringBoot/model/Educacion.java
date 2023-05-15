
package com.primerApp.SpringBoot.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
@Table(name="Educacion")
public class Educacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name="Nombre" , nullable= false)
    private String nombre;
    @Column(name="Titulo" , nullable= false)
    private String titulo;
    @Column(name="FechaInicio" , nullable= false)
    private String fechaInicio;
    @Column(name="FechaFin" , nullable= false)
    private String fechaFin;

    public Educacion() {
    }

    public Educacion(Long id, String nombre, String titulo, String fechaInicio, String fechaFin) {
        this.id = id;
        this.nombre = nombre;
        this.titulo = titulo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }
    
    
}
