/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.primerApp.SpringBoot.Controller;

import com.primerApp.SpringBoot.model.Persona;

import com.primerApp.SpringBoot.services.PersonaService;

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
@RequestMapping("persona")
@CrossOrigin (origins = "http://localhost:4200")
public class PersonaController {
    
  
    @Autowired
    public PersonaService persoServ;
   
    
    @PostMapping ("/new/persona")
    public void agregarPersona(@RequestBody Persona pers){
     persoServ.crearPersona(pers);
       
    }
    
   @PutMapping ("/edit/persona")
   public void editarPersona(Persona pers){
       persoServ.editPersona(pers);
   }
    
    @DeleteMapping ("/elimPersona/{id}")
    
    public void eliminarPersonas(@PathVariable Long id){
        
        persoServ.delPersona(id);
        
    }
    
    
    
     @GetMapping ("/ver/personas")
    @ResponseBody
    public List<Persona> verPersonas(){
        return persoServ.verPersonas();
       
    }
}
