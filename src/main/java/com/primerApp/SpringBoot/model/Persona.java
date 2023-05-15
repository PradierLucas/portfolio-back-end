/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
@Table(name="Persona")
public class Persona {
        
 

    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name="nombre" , nullable= false)
    private String nombre;
    @Column(name="apellido", nullable= false)
    private String apellido;
    @Column(name="titulo", nullable= false)
    private String titulo;
    @Column(name="foto", nullable= false)
    private String foto;
    @Column(name="descripcion", nullable= false)
    private String descripcion;

    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, String titulo, String foto, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.foto = foto;
        this.descripcion = descripcion;
    }



}
