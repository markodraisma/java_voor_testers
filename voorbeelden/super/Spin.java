class Spin extends Dier
{
  int aantalPoten = 8;

  void toonAantalPoten()
  {
    System.out.println("aantal poten Spin: " + aantalPoten);
    System.out.println("aantal poten Dier: " + super.aantalPoten);
  }
}