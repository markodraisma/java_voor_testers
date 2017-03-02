class Email implements Boodschap
{  

  String antwoordAdres = "info@5hart.nl";
  String tekst;
  
  public void setTekst(String tekst)
  {
    this.tekst=tekst;
  }
  
  public String getTekst()
  {
    return tekst+ "\n(" + antwoordAdres + ")";
  }
}
