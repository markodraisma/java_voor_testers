public class RekeningValidator {


   public String verwijderPunten(String s){
      return s.replace(".","");
   }

   public boolean heeftNegenCijfers(String s){
      try {
        Long.parseLong(s);
      } catch(NumberFormatException nfe){
        // lukt niet om s naar long te parsen
        return false;
      }
      return s.length()==9;
   }

   public boolean isGeldigBankNummer(String s){
     String invoerZonderPunten = verwijderPunten(s);
     if(heeftNegenCijfers(invoerZonderPunten)==false){
       return false;
     }
     int totaal=0;
     for(int i=0,j=9;i<9;i++,j--){
       int getal = Integer.parseInt(invoerZonderPunten.substring(i,i+1))*j;
       totaal += getal;
     }
     return totaal%11==0;

   }

}
