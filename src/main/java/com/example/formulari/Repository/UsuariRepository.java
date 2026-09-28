package com.example.formulari.Repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.formulari.Entity.Usuari;

@Repository 
public interface UsuariRepository extends CrudRepository<Usuari,Long>{

    boolean existsByNom(String nom);
    @Modifying 
    @Query(value = "INSERT INTO usuaris (nom, password, correu, missatge) values (:nom, :password, :correu, :missatge)", nativeQuery = true)
    void insertUser(@Param("nom") String nom, @Param("password") String password , @Param("correu") String correu , @Param("missatge") String missatge );
} 
