class ForEachArray2 {
  
   public static void main(String args[]) {
     int huidig=1;
     int[] reeks = new int[10];   // array van 10 integers
     for (int getal: reeks) {     // voor elk getal in de reeks
       getal=huidig;              // wijs huidige waarde toe aan getal
       System.out.println(getal); 
       huidig++;
     }
     
     for (int getal:reeks) {      // voor elk getal in de reeks
       System.out.println(getal); // toon de waarde.
     }
     
   }
}