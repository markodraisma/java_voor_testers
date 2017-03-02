interface Ontvanger
{
  void ontvangen(Boodschap b);
  void verzenden(Boodschap b, Ontvanger o);
}