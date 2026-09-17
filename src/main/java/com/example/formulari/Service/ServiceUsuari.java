package com.example.formulari.Service;


import org.springframework.stereotype.Service;
import com.example.formulari.Entity.Usuari;
import com.example.formulari.Repository.UsuariRepository;

/* Importacions per utilitzar fitxers en comptes de bd
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import tools.jackson.databind.ObjectMapper;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;*/

@Service
public class ServiceUsuari{
    /*@Autowired
    public ServiceUsuari(){
        
    } Si utilitzes un repositori seria necessari*/
     private UsuariRepository usuariRepository;
    public void addUsuari(Usuari usuari){
        usuariRepository.save(usuari);
    }

    public Usuari getUsuariPerId(Long id){
        
        return usuariRepository.findById(id).get();
       
    }

    /*
        Versió amb fitxer de text
        public void addUsuariFormatText(Usuari usuari){
        String nomFitxer = "user.txt";
        Resource directori = new ClassPathResource(nomFitxer);
        try 
        {
            File fitxer;
            if(!directori.exists())
            {
                fitxer = new File(nomFitxer);
                BufferedWriter escriptor = new BufferedWriter(new FileWriter(fitxer));
                ObjectMapper userMapper = new ObjectMapper();
                String usuariJSON = userMapper.writeValueAsString(usuari);
                escriptor.write(usuariJSON);
                escriptor.flush();
                escriptor.close();
            }
            else{
                fitxer = directori.getFile();
                BufferedWriter escriptor = new BufferedWriter(new FileWriter(fitxer));
                ObjectMapper userMapper = new ObjectMapper();
                String usuariJSON = userMapper.writeValueAsString(usuari);
                escriptor.write(usuariJSON);
                escriptor.flush();
                escriptor.close();
            }
            

        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }*/
}