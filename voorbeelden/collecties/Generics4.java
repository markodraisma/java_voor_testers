import java.util.*;

class Generics4 {

  public static void main(String args[])
  {
    Collection<Float> prijzen = new ArrayList<Float>();
    prijzen.add(4.5f);
    prijzen.add(2.3f);
    toonTotaal(prijzen);

    Collection<Integer> priem = new ArrayList<Integer>();
    priem.add(5);
    priem.add(7);
    toonTotaal(priem);
  }


  public static <T extends Number> void toonTotaal(Collection<T> c)
  {
    float totaal=0;
    for(T getal: c){
	   totaal+=t.floatValue();
	}
    System.out.println(totaal);
  }

}