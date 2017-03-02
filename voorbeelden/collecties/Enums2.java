class Enums2 {

  enum Maten {
  
     S("Small"), M("Middle"), L("Large")
     , XL("Extra Large"), XXL("Extra Extra Large");
     
     private final String maat;
     
     Maten(String maat) { 
       this.maat=maat;
     }
     
     public String toString() {
       return maat;
     }
  };
  
  public static void main(String args[]) {
  
    for(Maten m:Maten.values()) {
      System.out.println(m);
    }
  }
}