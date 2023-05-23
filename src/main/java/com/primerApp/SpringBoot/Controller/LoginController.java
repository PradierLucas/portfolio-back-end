/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.primerApp.SpringBoot.Controller;



import com.primerApp.SpringBoot.model.Login;
import com.primerApp.SpringBoot.repository.LoginRepository;
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

@RequestMapping("/login/")
@CrossOrigin (origins = "https://porfolio-7cda6.web.app")
public class LoginController {
      @Autowired
    public LoginRepository logrepo;
   
    
    @PostMapping ("/new/log")
    public void agregarLog(@RequestBody Login log){
     logrepo.save(log);
       
    }
    
   @PutMapping ("/edit/log/{id}")
   public void editarPersona(@PathVariable Long id, @RequestBody Login log){
            
       Login login = logrepo.findById(id).orElse(null);
       
       login.setEmail(log.getEmail());
       login.setPassword(log.getPassword());
     
       logrepo.save(login);
   }
    
    @DeleteMapping ("/elim/{id}")
    
    public void eliminarLog(@PathVariable Long id){
        
        logrepo.deleteById(id);
        
    }
    
    
    
     @GetMapping ("/ver/log")
    @ResponseBody
    public List<Login> verEdu(){
        return logrepo.findAll();
       
    }  
}
