class TestDier
{
  public static void main (String args[])
  {
     Vogel tweety = new Vogel();
     tweety.leefgebied = "lucht";
     
     Vis nemo = new Vis();
     nemo.leefgebied = "water";
     
     System.out.println(tweety.leefgebied);
  }
}