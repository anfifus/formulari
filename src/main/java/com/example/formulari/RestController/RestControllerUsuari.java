package com.example.formulari.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.formulari.Service.ServiceUsuari;
import com.example.formulari.Entity.Usuari;

@RestController
public class RestControllerUsuari{
    private ServiceUsuari serviceUsuari;

    @Autowired
    public RestControllerUsuari(ServiceUsuari serviceUsuari)
    {
        this.serviceUsuari = serviceUsuari;
    }
    @PostMapping("/usuari")
    public void addUsuari(@RequestBody Usuari usuari){
        serviceUsuari.addUsuari(usuari);
    }
    @GetMapping("/usuari/{id}")
    public Usuari getUsuariPerId(@PathVariable Long id){
        return  serviceUsuari.getUsuariPerId(id);
    }
    
}