
package com.primerApp.SpringBoot.repository;

import com.primerApp.SpringBoot.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


        
@Repository        
public interface PersonaRepository extends JpaRepository <Persona, Long> {
    
}
