
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
@Table(name="Experiencia")
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name="nombreEmpresa" , nullable= false)
    private String nombreEmpresa;
    @Column(name="puesto", nullable= false)
    private String puesto;
    @Column(name="fechaInicio", nullable= false)
    private String fechaInicio;
    @Column(name="fechaFin", nullable= false)
    private String fechaFin;
    @Column(name="descripcion", nullable= false)
    private String descripcion;

    public Experiencia() {
    }

    public Experiencia(Long id, String nombreEmpresa, String puesto, String fechaInicio, String fechaFin, String descripcion) {
        this.id = id;
        this.nombreEmpresa = nombreEmpresa;
        this.puesto = puesto;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.descripcion = descripcion;
    }

  
}
