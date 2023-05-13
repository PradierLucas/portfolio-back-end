
package com.primerApp.SpringBoot.services;

import com.primerApp.SpringBoot.model.Persona;
import com.primerApp.SpringBoot.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService  {

@Autowired

public PersonaRepository persoRepo;

   
    public List<Persona> verPersonas() {
        return persoRepo.findAll();
    }

 
    public void crearPersona(Persona pers) {
        
        persoRepo.save(pers);
    }


    public void delPersona(Long id) {
persoRepo.deleteById(id);    }

 
    public Persona buscarPersona(Long id) {
    return persoRepo.findById(id).orElse(null);  
    }

    
    public void editPersona(Persona pers) {
        persoRepo.save(pers);
    }
    
   
}