/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.primerApp.SpringBoot.Controller;


import com.primerApp.SpringBoot.model.Educacion;
import com.primerApp.SpringBoot.services.EducacionService;


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

 @RequestMapping("edu")
@CrossOrigin (origins = "http://localhost:4200")   
  public class EducacionController {
    @Autowired
    public EducacionService eduServ;
   
    
    @PostMapping ("/new/edu")
    public void agregarEdu(@RequestBody Educacion edu){
     eduServ.crearEducacion(edu);
       
    }
    
   @PutMapping ("/edit/edu")
   public void editarPersona(Educacion edu){
       eduServ.editEdu(edu);
   }
    
    @DeleteMapping ("/elimEdu/{id}")
    
    public void eliminarEdu(@PathVariable Long id){
        
        eduServ.delEducacion(id);
        
    }
    
    
    
     @GetMapping ("/ver/edu")
    @ResponseBody
    public List<Educacion> verEdu(){
        return eduServ.verEducacion();
       
    }

    
}
