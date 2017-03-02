package com.vijfhart.cursus;
public class RekenHulp  {

   public long faculteit(int x){
      if(x<0){
        throw new ArithmeticException("Faculteit van negatief getal bestaat niet");
      }
      long result = 1;
      for(int i = 2; i<=x; i++){
        result *= i;
      }
      return result;
   }


   public double rondAf(double getal, int decimalen){
     double factor = Math.pow(10,decimalen);
     double vermenigvuldigd = Math.round(getal * factor);
     return vermenigvuldigd/factor;
   }

   public boolean isPriem(long x){
      if(x==1) return false;
      if(x==2) return true;
      for(long i=3;i<=Math.sqrt(x);i++){
        if(x%i==0) return true;
      }
      return false;
   }

}
