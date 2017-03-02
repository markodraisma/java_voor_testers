class UpperApp
{
  public static void main (String args[]) throws Exception
  {
    if(args.length!=1)
    {
      Exception e = new Exception("Gebruik: UpperApp <woord>");
      throw e;
    }
    System.out.println(args[0].toUpperCase());
  }
}