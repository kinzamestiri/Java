/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;
import tn.tuniprod.gestionmagasin.Caissier;
import tn.tuniprod.gestionmagasin.Magasin;
import tn.tuniprod.gestionmagasin.Responsable;
import tn.tuniprod.gestionmagasin.Vendeur;
/**
 *
 * @author Mon Pc
 */
public class Ex1 {

    /**
     * @param args the command line arguments
     *///1
    public static void main(String[] args) {
       Produit p =new Produit();
       Produit p1 =new Produit(1021,"lait","delice");
       Produit p2 =new Produit(2510,"yaourt","vitalait");
       Produit p3 =new Produit(3250,"tomate","sicam",1.2f);
       
       p1.prix=0.7f;
       p.afficher();
          System.out.println("**********************************");
       p3.afficher();
           System.out.println("**********************************");
       p1.afficher();
           System.out.println("**********************************");
       p2.afficher();
       
       
           System.out.println("**********************************");
           System.out.println(p1.toString());
          /* p.date_expiration=new Date();
           p1.date_expiration=new Date(122,5,6);
           p2.date_expiration=new Date(122,3,2);*/
           
        SimpleDateFormat x = new SimpleDateFormat("dd/MM/yyyy")
           ;
        try{
            Date exp = x.parse("02/04/2022");
            System.out.println("********************");
            System.out.println(exp);
            System.out.println("********************");
            
        }catch (ParseException e){
           
    }
        Magasin aziza =  new Magasin(1,"Esprit");
        aziza.ajouterProduit(p);
        aziza.ajouterProduit(p2);
        aziza.ajouterProduit(p3);
        aziza.ajouterProduit(p1);
      
        
 p1.comparer(p3);
 aziza.comparer(p, p1);
 
 
        Magasin mag = new Magasin(1, "carrefour", "centre-ville");
        Magasin mag2 = new Magasin(2, "Monoprix", "menzah 6");
        
        Caissier c1 = new Caissier(1, "xx", "aqw", 22, 10);
        Caissier c2 = new Caissier(2, "yy", "aqw", 20, 10);
        Vendeur v1 = new Vendeur(1, "salah", "tunis", 14, 20);
        Responsable r1 = new Responsable(1, "chef", "tunis", 12, (int) 40.0);
        
        Caissier c3 = new Caissier(1, "zz", "aqw", 22, 10);
        Vendeur v2 = new Vendeur(2, "salah", "tunis", 14, 20);
        Vendeur v3 = new Vendeur(3, "flen", "tunis", 14, 20);
        Vendeur v4 = new Vendeur(4, "falten", "tunis", 14, 20);
        Responsable r2 = new Responsable(11, "azerty", "tunis", 161, (int) 40.0);
       
       mag.employe.add(c1);
       mag.employe.add(c2);
       mag.employe.add(v1);
       mag.employe.add(r1);
       
       mag2.employe.add(c3);
       mag2.employe.add(v2);
       mag2.employe.add(v3);
       mag2.employe.add(v4);
       mag2.employe.add(r2);
    
}
//2
    
}