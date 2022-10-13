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
public class Caissier extends Employe {
    int num_caisse;
    
public Caissier(int id, String adresse, String nom,int nbr_h,int num_caisse){
    super(id,adresse,nom,nbr_h);
    this.num_caisse=num_caisse;
}

@Override
    public String toString() {
        return "Caissier{"+ "id=" + getId() + ", nom=" + getNom() + ", adresse=" + getAdresse() + ", nbr_h= " + getNbr_h()  + " num_caisse= " + num_caisse + '}';
    }
    
 public void salaire(){
 int nbr_h_sup=0;
 if(getNbr_h()>180){
     nbr_h_sup=getNbr_h()-180;
     }
  Double total= ((getNbr_h())*5)+(nbr_h_sup*5)*0.15;
        System.out.println("Salaire = "+total);  
    }

}
