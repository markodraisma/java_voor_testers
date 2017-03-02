package com.vijfhart.cursus.vormen;
public class Balk extends Rechthoek {
   private double diepte;
  
   public Balk(double hoogte, double breedte, double diepte){
     super(hoogte,breedte);
     this.diepte=diepte;
   }
   
   public double oppervlakte() {
     return 2*(getBreedte()*getHoogte() + getBreedte()*diepte + diepte*getHoogte());
   }
   
   public double inhoud() {
     return getBreedte()*getHoogte()*diepte;
   }
   
   public double getDiepte(){
     return diepte;
   }
}

