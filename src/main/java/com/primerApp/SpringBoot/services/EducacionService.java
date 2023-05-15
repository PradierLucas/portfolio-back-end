/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.primerApp.SpringBoot.services;

import com.primerApp.SpringBoot.model.Educacion;
import com.primerApp.SpringBoot.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service


public class EducacionService implements IEducacionServicio {
 
    @Autowired
    
    public EducacionRepository edurepo;

    @Override
    public List<Educacion> verEducacion() {
        
        return edurepo.findAll();
    }

    @Override
    public void crearEducacion(Educacion edu) {
        
        edurepo.save(edu);
    }

    @Override
    public void delEducacion(Long id) {
        edurepo.deleteById(id);
    }

    @Override
    public void editEdu(Educacion edu) {
        edurepo.save(edu);
}

   
  
}