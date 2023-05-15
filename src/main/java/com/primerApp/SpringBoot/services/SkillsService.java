package com.primerApp.SpringBoot.services;

import com.primerApp.SpringBoot.model.Skills;
import com.primerApp.SpringBoot.repository.SkillsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillsService implements ISkillsServicio {

    @Autowired

    public SkillsRepository skillsrepo;

    @Override
    public List<Skills> verSkill() {
        return skillsrepo.findAll();

    }

    @Override
    public void crearSkill(Skills skill) {

        skillsrepo.save(skill);
    }

    @Override
    public void delSkill(Long id) {
        skillsrepo.deleteById(id);
    }

    @Override
    public void editSkill(Skills skill) {
        skillsrepo.save(skill);
    }

    @Override
    public Skills buscarSkill(Long id) {
        return skillsrepo.findById(id).orElse(null);    }

}
