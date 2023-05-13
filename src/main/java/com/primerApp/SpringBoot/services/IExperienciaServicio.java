/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.primerApp.SpringBoot.services;

import com.primerApp.SpringBoot.model.Experiencia;
import java.util.List;




public interface IExperienciaServicio {
     
     public List<Experiencia> verExperiencia();
     
   
    public void crearExperiencia(Experiencia exp);
      
      public void delExperiencia(Long id);

       public Experiencia buscarExp(Long id);
       
      public void editExp(Experiencia exp); 


      
}
