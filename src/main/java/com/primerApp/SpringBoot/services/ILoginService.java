/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.primerApp.SpringBoot.services;


import com.primerApp.SpringBoot.model.Login;
import java.util.List;

/**
 *
 * @author lucas
 */
public interface ILoginService {
     public List<Login> verLog();
     
   
    public void crearLog(Login log);
      
      public void delLog(Long id);
       
      public void editLog(Login log); 
}
