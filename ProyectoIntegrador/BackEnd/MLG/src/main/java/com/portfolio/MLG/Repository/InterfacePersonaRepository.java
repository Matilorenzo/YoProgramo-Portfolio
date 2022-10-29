package com.portfolio.MLG.Repository;

import com.portfolio.MLG.Entity.Persona;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterfacePersonaRepository extends JpaRepository<Persona,Integer>{
      public Optional<Persona> findByNombreE(String nombre);
    public boolean existsByNombre(String nombre);
}
