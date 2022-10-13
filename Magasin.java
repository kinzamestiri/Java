/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.tuniprod.gestionmagasin;

import ex1.Produit;

/**
 *
 * @author Mon Pc
 */
public class Magasin {

    private int id;
    private String nom;
    private String adresse;
    private int capacite;
    private Produit[] ens_p;
    private Employe[] employe;

    public Magasin() {
        this.ens_p = new Produit[50];
    }

    public Magasin(int id,String nom, String adresse) {
        this.id = id;
        this.nom=nom;
        this.adresse = adresse;
        this.capacite = 0;
        this.ens_p = new Produit[50];
    }

    public Magasin(int i, String esprit) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void ajouterProduit(Produit p) {
        if (this.capacite < 50) {
            ens_p[this.capacite] = p;
            this.capacite++;
        } else {
            System.err.println("Tableau plient .....");
        }
    }

    public String toString() {
        String str = "";
        for (int i = 0; i < this.capacite; i++) {
            str += "\n nom" + ens_p[i].libelle + " Prix" + ens_p[i].prix;
        }
        return "le magasin id:  " + this.id + "\nadresse" + this.adresse + "\n Produit " + str;

    }
    
     public boolean comparer(Produit p,Produit p1){
    return((p1.id==p.id)&&(p1.libelle==p.libelle)&&(p1.prix==p.prix));
    }
     
     public boolean rechercher(Produit p){
     boolean resultat = false;
     int i=0;
     while((resultat)||(i<this.capacite)){
         resultat=comparer(p,this.ens_p[i]);
         i++;
     }
     return resultat;
}
     
     public void ajouterProd(Produit p){
     if(this.capacite<50){
     if (rechercher (p))
             {
             ens_p[this.capacite]=p;
             this.capacite++;
             }else 
         System.out.println("tableau plient..") ;   
                 }
     }
     
     public void supprimer(Produit p)
     {       int index=-1;
            for(int i=0;i<this.capacite;i++){
                if(comparer(this.ens_p[i],p)){
                index=i;
                break;
                }
             if(index==49){
             ens_p[index]=null;
             }
            }
            for (int i=index;i<capacite;i++){
            ens_p[i]=ens_p[i+1];
             }
            capacite--;
            ens_p[capacite]=null;
     }
     
     
   /*  public Magasin(String adresse) {
        this.id = id;
        this.adresse = adresse;
        this.capacite = 0;
        this.ens_p = new Produit[50];
    }*/
     
     public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;}
    
    
     public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
        
    }
      public Magasin(int id, String nom, String adresse, Employe e) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        employe.Ajouter(e);

    
        public void Ajouter(Employe e){
       
        for(int i=0; i<20; i++)
             {
             employe[i]=e;
             i++;
             }else 
         System.out.println("tableau plient..") ;   
                 }
        
        afficherEmp();
}
      public void afficherEmp() {
         System.out.println("Caracteristiques employes");
          
        for(int i=0; i<20; i++)
         {
         	System.out.println (employe[i].toString());
         }
    
}

    /*public class employe {

        public static void add(Caissier c2) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public employe() {
        }*/
    }
         
        
        
    
     