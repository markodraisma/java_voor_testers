class Kies
{
  public static void main(String args[])
  {
    int test = Integer.parseInt(args[0]);
    
    if(test>10)
    {
      System.out.println("groter dan 10");
    }
    else
    {
      if(test>5)
      {
        System.out.println("tussen 6 en 10");
      }
      else
      {
        if(test>1)
        {
          System.out.println("tussen 2 en 5");
        }
        else
        {
          System.out.println("1 of kleiner");
        }
      }
    }
  }
}