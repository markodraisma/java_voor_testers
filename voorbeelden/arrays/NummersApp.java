class NummersApp
{
  public static void main (String args[])
  {
    int[] nummers = new int[10];
    
    for (int i=0; i<nummers.length; i++)
    {
      nummers[i]=(i+1)*2;
    }
    
    for (int i=0; i<nummers.length; i++)
    {
      System.out.println(nummers[i]);
    }
  }
}