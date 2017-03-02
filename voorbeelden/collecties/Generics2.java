import java.util.*;

class Generics2 {

  public static void main(String args[])
  {
    Map<String, Float> artikelen = new HashMap<String, Float>();
    artikelen.put("schrijfblok",1.2f);
    artikelen.put("balpen",0.8f);
    toonInhoud(artikelen.keySet());
    toonInhoud(artikelen.values());
  }


  public static void toonInhoud(Collection<?> c)
  {
    Iterator<?> i = c.iterator();
    while(i.hasNext())
    {
       System.out.println(i.next());
    }
  }

}