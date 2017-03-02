import java.util.*;

class PrijzenApp
{

  public static void main (String args[])
  {
    float totaal = 0;
    Map<String, Float> prijzen = new HashMap<String, Float>();
    prijzen.put("koffie", new Float(1.60)); // Float als wrapper klasse van float
    prijzen.put("thee", new Float(1.50));
    prijzen.put("gebak", new Float(2.15));

    totaal+=prijs(prijzen.get("koffie"), 2);
    totaal+=prijs(prijzen.get("thee"), 1);
    totaal+=prijs(prijzen.get("gebak"), 1); 
       
    System.out.println(totaal);
  }

  static float prijs(Object o, int aantal)
  {
    Float f = (Float)o;          // De methode get() van Map retourneert een
                                 // Object: moet gecast worden naar Float.
    return f.floatValue()*aantal;// De methode floatValue() retourneert de
                                 // primitieve waarde waarmee gerekend kan worden
  }

}
