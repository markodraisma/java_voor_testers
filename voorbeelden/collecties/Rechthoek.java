class Rechthoek implements Comparable<Rechthoek>
{
  int lengte, breedte;

  Rechthoek(int lengte, int breedte)        // constructor
  {
    this.lengte = lengte;
    this.breedte = breedte;
  }

  public String toString()                  // string representatie van een object
  {
    return "("+lengte+","+breedte+")"; 
  }

  public int compareTo(Rechthoek r)
  {
    
    if(lengte*breedte > r.lengte*r.breedte) // eigen oppervlakte is groter
      return 1;
    if(lengte*breedte < r.lengte*r.breedte) // eigen oppervlakte is kleiner
      return -1;
      
    return 0;                               // oppervlakten even groot
  }
}
