class TestKlant
{
  public static void main(String args[])
  {
    Klant klantA = new Klant();
    Klant klantB = new Klant();
    klantA.setNaam("Lucebert");
    klantB.setNaam("W.F.","Hermans");
    System.out.println(klantA.naam);
    System.out.println(klantB.naam);
  }
}