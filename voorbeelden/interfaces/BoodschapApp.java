class BoodschapApp
{
  public static void main (String args[])
  {
    Ontvanger marion = new Persoon("Marion");
    Ontvanger albert = new Persoon("Albert");
    
    // brief van Marion aan Albert:
    
    Boodschap b1 = new Brief();
    b1.setTekst("Dag Albert, hoe gaat het met jou? Groetjes, Marion.");
    marion.verzenden(b1, albert);
    
    // reactie van Albert aan Marion per email:
    
    Boodschap b2 = new Email();
    b2.setTekst("Dag Marion, met mij gaat het goed! Tot ziens, Albert");
    albert.verzenden(b2, marion);
  }
}
