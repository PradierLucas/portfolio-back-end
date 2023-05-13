/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.primerApp.SpringBoot.Controller;


import com.primerApp.SpringBoot.model.Skills;

import com.primerApp.SpringBoot.services.SkillsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


 @RestController
 @RequestMapping("skills")
@CrossOrigin (origins = "http://localhost:4200")
public class SkillsController {
    



    
  
    @Autowired
    public SkillsService skillServ;
   
    
    @PostMapping ("/new/skill")
    public void agregarSkill(@RequestBody Skills skill){
     skillServ.crearSkill(skill);
       
    }
    
   
    
    @DeleteMapping ("/elimSk/{id}")
    
    public void eliminarSkill(@PathVariable Long id){
        
        skillServ.delSkills(id);
        
    }
    
    
    
     @GetMapping ("/ver/skill")
    @ResponseBody
    public List<Skills> verSkills(){
        return skillServ.verSkills();
       
    }
    
    @PutMapping ("/editar/skill")
    
    public void editarSkill (@RequestBody Skills skill){
        skillServ.editSkill(skill);
    }
    
    
}
