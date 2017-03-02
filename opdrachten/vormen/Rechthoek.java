public class Rechthoek {
   private final double hoogte, breedte;
   
   public Rechthoek(double hoogte, double breedte){
     this.hoogte=hoogte;
     this.breedte=breedte;
   }
   
   public double getHoogte(){
     return hoogte;
   }

   public double getBreedte(){
     return breedte;
   }

   public double oppervlakte(){
     return hoogte*breedte;
   }
}

