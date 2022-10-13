/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.tuniprod.gestionmagasin;

/**
 *
 * @author Mon Pc
 */
public class Employe {
     private int id;
    private String adresse;
    private String nom;
    private int nbr_h;
 
    
   

   
   
    public Employe(int id, String adresse, String nom,int nbr_h){
     this.id=id;
     this.adresse=adresse;
     this.nom=nom;  
     this.nbr_h=nbr_h;
   }
    @Override
    public String toString(){
            return "Employe{"+"id= "+this.id+ " nom= "+this.nom+ " adresse= "+this.adresse+ " nombres d'heures= "+this.nbr_h+"}" ;
     
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
     public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
     public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    
    public int getNbr_h() {
        return nbr_h;
    }
    public void setNbr_h(int nbr_h) {
        this.nbr_h = nbr_h;
    }
    
}
