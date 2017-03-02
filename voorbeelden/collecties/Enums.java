class Enums {

  enum Maten {S, M, L, XL, XXL};
  
  public static void main(String args[])
  {
    for(Maten m:Maten.values())
    {
      System.out.print(m);
      System.out.println(omschrijving(m));
    }
  }
  
  private static String omschrijving(Maten waarde)
  {
    switch(waarde)
    {
      case S: return " Small";
      case M: return " Middle";
      case L: return " Large";
      case XL: return " Extra Large";
      case XXL: return " Extra Extra Large";
      default: return " Onbekende maat";
    }
  }
}