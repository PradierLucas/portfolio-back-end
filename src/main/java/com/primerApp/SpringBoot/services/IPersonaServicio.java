/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.primerApp.SpringBoot.services;

import com.primerApp.SpringBoot.model.Persona;
import java.util.List;

/**
 *
 * @author lucas
 */
public interface IPersonaServicio {

    public List<Persona> verPersona();

    public void crearPersona(Persona pers);
    public void editPersona(Persona pers);
    
    public Persona buscarPersona(Long id);
    
    public void borrarPersona(Long id);

}
