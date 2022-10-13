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
public class Responsable extends Employe {
    int prime;//en%
    
public Responsable(int id, String adresse, String nom,int nbr_h,int prime){
    super(id,adresse,nom,nbr_h);
    this.prime=prime;
}

@Override
    public String toString() {
        return "Caissier{"+ "id=" + getId() + ", nom=" + getNom() + ", adresse=" + getAdresse() + ", nbr_h= " + getNbr_h()  + " prime= " + prime + '}';
    }
    
 public void salaire(){
 int nbr_h_sup=0;
 if(getNbr_h()>160){
     nbr_h_sup=getNbr_h()-160;
     }
  Double total= ((getNbr_h())*10)+(nbr_h_sup*10)*0.2;
        System.out.println("Salaire = "+total);  
    }


}
