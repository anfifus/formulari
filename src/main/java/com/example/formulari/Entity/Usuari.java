package com.example.formulari.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuari")
public class Usuari{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    @Column (name="nom",unique = true, nullable = false)
    private String nom;
    private String password;
	private String email;
	private String missatge;
    
    public Usuari(){}
    public Usuari(String nom,String password,String email,String missatge){
        this.nom = nom;
        this.password = password;
        this.email = email;
        this.missatge = missatge;
    }
    public String getNom(){return nom;}
    public String getPassword() {return password;}
    public String getEmail(){return email;}
    public String getMissatge(){return missatge;}

    public void setNom(String nom){this.nom = nom;}
    public void setPassword(String password) {this.password = password;}
    public void setEmail(String email){this.email = email;}
    public void setMissatge(String missatge){this.missatge = missatge;}
}