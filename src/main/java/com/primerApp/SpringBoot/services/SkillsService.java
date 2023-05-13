
package com.primerApp.SpringBoot.services;

import com.primerApp.SpringBoot.model.Skills;
import com.primerApp.SpringBoot.repository.SkillsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillsService {
     
   @Autowired
    
    public SkillsRepository skillsrepo;

    public List<Skills> verSkills() {
        return skillsrepo.findAll();
        
    }

    public void crearSkill(Skills skill) {
        
        skillsrepo.save(skill);
    }

    public void delSkills(Long id) {
        skillsrepo.deleteById(id);
    }

    public Skills buscarSkill(Long id) {
        
       return skillsrepo.findById(id).orElse(null);
    }

    public void editSkill(Skills skill) {
        skillsrepo.save(skill);
    }
   
    
}
