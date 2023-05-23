/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.primerApp.SpringBoot.Controller;


import com.primerApp.SpringBoot.model.Educacion;
import com.primerApp.SpringBoot.repository.EducacionRepository;
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

@RequestMapping("/edu/")
@CrossOrigin (origins = "https://porfolio-7cda6.web.app")   
  public class EducacionController {
    @Autowired
    public EducacionRepository edurepo;
   
    
    @PostMapping ("/new/edu")
    public void agregarEdu(@RequestBody Educacion edu){
     edurepo.save(edu);
       
    }
    
   @PutMapping ("/edit/edu/{id}")
   public void editarPersona(@PathVariable Long id, @RequestBody Educacion edu){
            
       Educacion educacion = edurepo.findById(id).orElse(null);
       
       educacion.setNombre(edu.getNombre());
       educacion.setTitulo(edu.getTitulo());
       educacion.setFechaInicio(edu.getFechaInicio());
       educacion.setFechaFin(edu.getFechaFin());
       
       edurepo.save(educacion);
   }
    
    @DeleteMapping ("/elim/{id}")
    
    public void eliminarEdu(@PathVariable Long id){
        
        edurepo.deleteById(id);
        
    }
    
    
    
     @GetMapping ("/ver/edu")
    @ResponseBody
    public List<Educacion> verEdu(){
        return edurepo.findAll();
       
    }

    
}
