package com.vijfhart.cursus;
public class Artikel {

  private String naam;
  private double prijs;

  public Artikel (String naam, double prijs){
    this.naam = naam;
    this.prijs = prijs;
  }

  public Artikel (){ }

  public String getNaam(){ return naam; }
  public double getPrijs() { return prijs; }

  public void setNaam(String naam){
    this.naam = naam;
  }

  public void setPrijs(double prijs){
    this.prijs=prijs;
  }
}

