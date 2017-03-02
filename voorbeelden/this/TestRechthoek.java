public class TestRechthoek
{
  public static void main(String args[])
  {
    Rechthoek r1 = new Rechthoek();
    Rechthoek r2 = new Rechthoek(15,20);
    
    System.out.println("Oppervlakte r1: " + (r1.hoogte*r1.breedte));
    System.out.println("Oppervlakte r2: " + (r2.hoogte*r2.breedte));
    
  }
}
