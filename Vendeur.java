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
public class Vendeur extends Employe {
    float TauxdeVente;
    
public Vendeur(int id, String adresse, String nom,int nbr_h,float TauxdeVente){
    super(id,adresse,nom,nbr_h);
    this.TauxdeVente=TauxdeVente;
}
@Override
    public String toString() {
        return "Caissier{"+ "id=" + getId() + ", nom=" + getNom() + ", adresse=" + getAdresse() + ", nbr_h= " + getNbr_h()  + " TauxdeVente= " + TauxdeVente+ '}';
    }
    
 public void salaire(){
     float  total;
     float taux= (this.TauxdeVente)/100;
     total=450 * taux;
        System.out.println("Salaire vendeur = "+total); 
    }
}
