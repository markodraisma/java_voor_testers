import java.util.*;

class Generics3 {

  public static void main(String args[])
  {
    Collection<Float> prijzen = new ArrayList<>();
    prijzen.add(4.5f);
    prijzen.add(2.3f);
    toonTotaal(prijzen);

    Collection<Integer> priem = new ArrayList<>();
    priem.add(5);
    priem.add(7);
    toonTotaal(priem);
  }


  public static void toonTotaal(Collection<? extends Number> c)
  {
    float totaal=0;
    Iterator<? extends Number> i = c.iterator();
    while(i.hasNext())
    {
      totaal+=i.next().floatValue();
    }
      System.out.println(totaal);
  }

}