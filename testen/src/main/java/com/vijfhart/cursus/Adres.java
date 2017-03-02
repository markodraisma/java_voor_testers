package com.vijfhart.cursus;
import java.util.regex.*;

class Adres {
  private String straatnaam;
  private String huisnummer;
  private String postcode;
  private String plaats;

  public Adres() {
  }

  public Adres(String straatnaam, String huisnummer, 
      String postcode, String plaats) {
    this.straatnaam = straatnaam;
    this.huisnummer = huisnummer;
    setPostcode(postcode);
    this.plaats = plaats;
  }

  public Adres(String straatnaam, String huisnummer, String plaats) {
    this(straatnaam, huisnummer, "", plaats);
  }

  public Adres(String postcode, String huisnummer) {
    this("", huisnummer, postcode, "");
  }

  public void setStraat(String straatnaam) {
    this.straatnaam=straatnaam;
  }

  public String getStraatnaam(){
    return straatnaam;
  }

  public void setHuisnummer(String huisnummer) {
    this.huisnummer=huisnummer;
  }

  public String getHuisnummer(){
    return huisnummer;
  }

  public void setPostcode(String postcode) {
    if(isValidPostcode(postcode)){
      this.postcode=postcode;
    }
  }

  public String getPostcode(){
    return postcode;
  }

  private boolean isValidPostcode(String postcode){
    String regex = "^[1-9][0-9]{3} ?[A-Z]{2}$";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(postcode);
    return matcher.matches();
  }

  public void setPlaats(String plaats) {
    this.plaats=plaats;
  }

  public String toString() {
    return straatnaam+" "+huisnummer+"/n"+
      postcode+" "+plaats;
  }
}

