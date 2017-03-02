class BoodschapApp
{
  public static void main (String args[])
  {
    Boodschap b1 = new Brief();
    Boodschap b2 = new Email();
    b1.verzenden();
    b2.verzenden();
  }
}
