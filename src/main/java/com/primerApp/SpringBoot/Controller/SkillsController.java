/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.primerApp.SpringBoot.Controller;

import com.primerApp.SpringBoot.model.Skills;
import com.primerApp.SpringBoot.repository.SkillsRepository;

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
@RequestMapping("/skills/")
@CrossOrigin(origins = "https://porfolio-7cda6.web.app")
public class SkillsController {

    @Autowired
    public SkillsRepository skillrepo;

    @PostMapping("/new/skill")
    public void agregarSkill(@RequestBody Skills skill) {
        skillrepo.save(skill);

    }

    @DeleteMapping("/elim/skill/{id}")

    public void eliminarSkill(@PathVariable Long id) {

        skillrepo.deleteById(id);

    }

    @GetMapping("/ver/skills")
    @ResponseBody
    public List<Skills> verSkills() {
        return skillrepo.findAll();

    }

    @PutMapping("/editar/skill/{id}")

    public void editarSkill(@PathVariable Long id, @RequestBody Skills ski) {

        Skills skill = skillrepo.findById(id).orElse(null);

        skill.setNombre(ski.getNombre());
        skill.setPorcentaje(ski.getPorcentaje());

        skillrepo.save(skill);
    }

}
