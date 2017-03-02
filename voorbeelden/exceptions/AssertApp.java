public class AssertApp
{
  public static void main (String args[])
  {

    assert args.length==2 : "voer twee positieve getallen in ";

    int start = Integer.parseInt(args[0]);
    int einde = Integer.parseInt(args[1]);
    

    assert start>=0 && einde>=0 : "gebruik alleen positieve getallen";
    assert start<einde : start + " is niet kleiner dan "+einde;
    
    int som=0;
    
    System.out.print("totaal van ");
    
    for (int i=start;i<=einde;i++)
    {
      som+=i;
      System.out.print(i + (i<einde? " + " : " = "));
    }    
    
    System.out.println(som);
  }
  
}
