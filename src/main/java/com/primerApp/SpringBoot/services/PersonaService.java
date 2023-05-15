package com.primerApp.SpringBoot.services;

import com.primerApp.SpringBoot.model.Persona;
import com.primerApp.SpringBoot.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaServicio {

    @Autowired

    public PersonaRepository persoRepo;

    @Override
    public List<Persona> verPersona() {
        return persoRepo.findAll();
    }

    @Override
    public void crearPersona(Persona pers) {
        persoRepo.save(pers);
    }

    @Override
    public void editPersona(Persona pers) {
        persoRepo.save(pers);
    }

    @Override
    public Persona buscarPersona(Long id) {
        return persoRepo.findById(id).orElse(null);    }

    @Override
    public void borrarPersona(Long id) {
persoRepo.deleteById(id);    }
}