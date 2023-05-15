package com.primerApp.SpringBoot.services;

import com.primerApp.SpringBoot.model.Skills;
import java.util.List;

public interface ISkillsServicio {

    public List<Skills> verSkill();

    public void crearSkill(Skills ski);

    public void delSkill(Long id);

    public void editSkill(Skills ski);
    
   
    public Skills buscarSkill(Long id);

}
