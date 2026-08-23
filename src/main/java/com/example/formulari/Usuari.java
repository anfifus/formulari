package com.example.formulari;

public class Usuari{
    private String nom;
	private String email;
	private String missatge;

    public Usuari(String nom,String email,String missatge){
        this.nom = nom;
        this.email = email;
        this.missatge = missatge;
    }
    public String getNom(){return nom;}
    public String getEmail(){return email;}
    public String getMissatge(){return missatge;}

    public void setNom(String nom){this.nom = nom;}
    public void setEmail(String email){this.email = email;}
    public void setMissatge(String missatge){this.missatge = missatge;}
}