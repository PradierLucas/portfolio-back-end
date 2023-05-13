
package com.primerApp.SpringBoot.repository;

import com.primerApp.SpringBoot.model.Skills;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author lucas
 */
public interface SkillsRepository extends JpaRepository <Skills, Long> {
    
}
