/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;
import java.util.Scanner;
import java.util.Date;
/**
 *
 * @author Mon Pc
 */
//1
public class Produit {
    public int id;
    public String libelle;
    String marque;
    public float prix;
    Date date_expiration;
    
    public Produit(){};
     public Produit(int id, String libelle, String marque){
     this.id=id;
     this.libelle=libelle;
     this.marque=marque;
     
     }
     public Produit(int id, String libelle, String marque,float prix){
     this.id=id;
     this.libelle=libelle;
     this.marque=marque;
     this.prix=prix;

     }
    void afficher(){
    System.out.println("le produit est id= "+this.id+ "\n libelle= "+this.libelle+ "\n marque= "+this.marque+ "\n prix= "+this.prix); 
    }
    
    @Override
    public String toString(){
            return "le produit est id= "+this.id+ "\n libelle= "+this.libelle+ "\n marque= "+this.marque+ "\n prix= "+this.prix+"\n date dexpiration: "+this.date_expiration ;
     
    }
    public boolean comparer(Produit p){
    return((this.id==p.id)&&(this.libelle==p.libelle)&&(this.prix==p.prix));
    }
}
