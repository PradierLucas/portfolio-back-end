
package com.primerApp.SpringBoot.services;

import com.primerApp.SpringBoot.model.Experiencia;
import com.primerApp.SpringBoot.repository.ExperienciaRepository;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service

public class ExperienciaService  implements IExperienciaServicio {
    
    @Autowired
    
    public ExperienciaRepository experienciarepo;

    @Override
    public List<Experiencia> verExperiencia() {
        return experienciarepo.findAll();
    }

    @Override
    public void crearExperiencia(Experiencia exp) {
         experienciarepo.save(exp);
    }

    @Override
    public void delExperiencia(Long id) {
        experienciarepo.deleteById(id);
    }

    @Override
    public  Experiencia buscarExp(Long id) {
            return experienciarepo.findById(id).orElse(null);
    }

    @Override
    public void editExp(Experiencia exp) {
        experienciarepo.save(exp);
    }

  
}
