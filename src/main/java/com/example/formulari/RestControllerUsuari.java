package com.example.formulari;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    
}