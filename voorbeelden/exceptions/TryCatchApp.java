import java.text.NumberFormat;

import java.util.Locale;


class TryCatchApp
{
  public static void main (String args[])
  {
    double bedrag=0;
        
    try
    {
      bedrag = Double.parseDouble(args[0]);
      System.out.println("Bedrag in Euro's: " + getBedrag(bedrag));
    }
    catch(RangeException e)
    {
      System.err.println(e.getMessage());
    }
    catch(PrecisieException e)
    {
      e.printStackTrace();
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
    finally
    {
      System.out.println("Bedrag was: " + bedrag);
    }
  }
 
  static String getBedrag(double bedrag) throws RangeException, PrecisieException
  {
    if(bedrag<=0 || bedrag>=100000)
      throw new RangeException("Bedrag niet tussen 0 en 100000.");
    if(Math.abs((bedrag*100)-Math.rint(bedrag*100))>.000000001)
      throw new PrecisieException("Bedrag heeft meer dan twee decimalen.");
      
    Locale local = new Locale("nl","NL", "EURO");
    NumberFormat form = NumberFormat.getCurrencyInstance(local);
    return form.format(bedrag);
  }

}


class RangeException extends Exception
{
  RangeException(String s)
  {
    super(s);
  }
}

class PrecisieException extends Exception
{
  PrecisieException(String s)
  {
    super(s);
  }
}