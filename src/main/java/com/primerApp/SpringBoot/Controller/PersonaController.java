/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.primerApp.SpringBoot.Controller;

import com.primerApp.SpringBoot.model.Persona;
import com.primerApp.SpringBoot.repository.PersonaRepository;
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
@RequestMapping("/persona/")
@CrossOrigin (origins = "https://porfolio-7cda6.web.app")
public class PersonaController {
    
  
    @Autowired
    public PersonaRepository persorepo;
   
        
    @DeleteMapping("/borrar/persona/{id}")
    public void borrarPersona(@PathVariable Long id){
        persorepo.deleteById(id);
    }
    
    @PostMapping("/crear/persona")
    public void crearPersona(@RequestBody Persona pers){
        persorepo.save(pers);
    }
    
   @PutMapping ("/editar/persona/{id}")
   public void editarPersona(@PathVariable Long id, @RequestBody  Persona pers){
       Persona persona = persorepo.findById(id).orElse(null);

        persona.setNombre(pers.getNombre());
        persona.setApellido(pers.getApellido());
        persona.setTitulo(pers.getTitulo());
        persona.setFoto(pers.getFoto());
        persona.setDescripcion(pers.getDescripcion());
        
        persorepo.save(persona);
   }
 
    @GetMapping ("/ver/personas")
    @ResponseBody
    public List<Persona> verPersona(){
        return persorepo.findAll();
       
    }
}
