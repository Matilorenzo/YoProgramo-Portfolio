package com.portfolio.MLG.Repository;

import com.portfolio.MLG.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterfacePersonaRepository extends JpaRepository<Persona,Long>{
    
}
