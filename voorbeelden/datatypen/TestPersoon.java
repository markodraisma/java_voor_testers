class TestPersoon
{
  public static void main (String args[])
  {
    Persoon rob, els;     // declaratie van de variabelen rob en els;

    rob = new Persoon();  // initialiseren van de variabelen rob en els;
    els = new Persoon();

    rob.lengte =  1.78;   // waarden toekennen aan de attributen
    els.gewicht = 67.5;

                          // waarden uitlezen:

    System.out.println("De lengte van Rob is " + rob.lengte + " m.");  
    System.out.println("Het gewicht van Els is " + els.gewicht + " kg.");
  
  }
}