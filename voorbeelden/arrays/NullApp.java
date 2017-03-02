class NullApp
{
  public static void main (String args[])
  {
    String[] namen = new String[5];

    namen[0] = "Madelief";
    namen[1] = "Roos";
    namen[2] = "Marjolein";
    namen[4] = "Paardenbloem";

    for(int i=0;i<namen.length;i++)
    {
      namen[i]=namen[i].toUpperCase();
      System.out.println(namen[i]);
    }
    
  }
}