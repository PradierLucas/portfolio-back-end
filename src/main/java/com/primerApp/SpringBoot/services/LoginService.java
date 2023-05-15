/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.primerApp.SpringBoot.services;

import com.primerApp.SpringBoot.model.Login;
import com.primerApp.SpringBoot.repository.LoginRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService implements ILoginService{

    @Autowired
    
    public LoginRepository logrepo;
    
    @Override
    public List<Login> verLog() {
return logrepo.findAll();    }

    @Override
    public void crearLog(Login log) {
logrepo.save(log) ;   }

    @Override
    public void delLog(Long id) {
logrepo.deleteById(id);    }

    @Override
    public void editLog(Login log) {
logrepo.save(log);    }
    
}
