class TafelsApp
{

  public static void main (String args[])
  {
    int[][] tafels = new int[12][10];
    for (int i=0;i<tafels.length;i++)
    {
      for (int j=0;j<tafels[i].length;j++)
      {
        tafels[i][j]=(i+1)*(j+1);
      }
    }

    // toon hier onder de inhoud van tafels


  }

}