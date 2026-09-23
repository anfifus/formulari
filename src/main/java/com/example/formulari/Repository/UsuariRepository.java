package com.example.formulari.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.formulari.Entity.Usuari;

@Repository 
public interface UsuariRepository extends CrudRepository<Usuari,Long>{

    boolean existByName(String nom);
    
} 
