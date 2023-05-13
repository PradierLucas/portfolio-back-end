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


public class EducacionService  {
 
    @Autowired
    
    public EducacionRepository edurepo;

    public List<Educacion> verEducacion() {
        
        return edurepo.findAll();
    }

    public void crearEducacion(Educacion edu) {
        
        edurepo.save(edu);
    }

    public void delEducacion(Long id) {
        edurepo.deleteById(id);
    }

    public Educacion buscarEducacion(Long id) {
        
        return edurepo.findById(id).orElse(null);    }

    public void editEdu(Educacion edu) {
        edurepo.save(edu);
}

}