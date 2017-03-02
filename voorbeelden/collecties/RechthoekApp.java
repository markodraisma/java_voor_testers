import java.util.SortedSet;
import java.util.TreeSet;

public class RechthoekApp
{
  public static void main (String args[])
  {
    SortedSet<Rechthoek> set = new TreeSet<Rechthoek>();
    
    Rechthoek r1 = new Rechthoek(3,5);  // oppervlakte = 15
    Rechthoek r2 = new Rechthoek(4,5);  // oppervlakte = 20
    Rechthoek r3 = new Rechthoek(3,6);  // oppervlakte = 18
    Rechthoek r4 = new Rechthoek(2,6);  // oppervlakte = 12
    
    set.add(r1);  // voegt r1 toe aan de set
    set.add(r2);  // voegt r2 toe aan de set
    set.add(r3);  // voegt r3 toe aan de set
    set.add(r4);  // voegt r4 toe aan de set

    System.out.println(set);
  }
}
