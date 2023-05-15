/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.primerApp.SpringBoot.services;

import com.primerApp.SpringBoot.model.Educacion;

import java.util.List;

/**
 *
 * @author lucas
 */
public interface IEducacionServicio {
    
     public List<Educacion> verEducacion();
     
   
    public void crearEducacion(Educacion edu);
      
      public void delEducacion(Long id);
       
      public void editEdu(Educacion edu); 
}
