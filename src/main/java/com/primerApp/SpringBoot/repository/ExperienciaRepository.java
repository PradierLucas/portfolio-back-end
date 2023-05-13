
package com.primerApp.SpringBoot.repository;

import com.primerApp.SpringBoot.model.Experiencia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository        


public interface ExperienciaRepository extends JpaRepository <Experiencia, Long> {

  
 
}
