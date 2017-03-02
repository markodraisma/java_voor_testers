public class Priem
{
  public static void main (String args[])
  {
    int start = Integer.parseInt(args[0]);
    int einde = Integer.parseInt(args[1]);
    
    for(int i=start;i<=einde && i>0;i++)
    {
      if (isPriem(i))
        System.out.println(i);
    }
  }
  
  static boolean isPriem(int getal)
  {
    if(getal>2 && getal%2==0)
    {
      return false;
    }
    
    for (int i=3; i<=Math.sqrt(getal); i+=2)
    {
      if(getal % i == 0)
      {
        return false;
      }
    }
    return true;
  }
}
