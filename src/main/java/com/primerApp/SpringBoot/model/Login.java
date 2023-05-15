/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.primerApp.SpringBoot.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

  @Getter @Setter
@Entity
@Table(name="Login")
public class Login {
   
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name="email" , nullable= false)
    private String email;
    @Column(name="password" , nullable= false)
    private String password;

    public Login() {
    }

    public Login(Long id, String email, String password) {
        this.id = id;
        this.email = email;
        this.password = password;
    }
    
    
}
