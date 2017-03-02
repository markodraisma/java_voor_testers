import java.util.*;

class MapApp
{
  public static void main (String args[])
  {
    Map<String, String> kantoren = new TreeMap<String, String>();
    
	kantoren.put("10","BOEKHOUDING");          // vullen van de Map
    kantoren.put("20","ONDERZOEK");
    kantoren.put("30","VERKOOP");
    kantoren.put("40","PRODUCTIE");

    System.out.println(kantoren);              // toon complete Map
    System.out.println(kantoren.keySet());     // toon alle sleutels
    System.out.println(kantoren.values());     // toon alle waarden
    System.out.println(kantoren.entrySet());   // toon sleutel - waarde paren
    System.out.println(kantoren.get("30"));    // toon waarde bij sleutel "30"
  }
}