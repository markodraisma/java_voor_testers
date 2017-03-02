import java.util.*;
import java.text.*;

class StartTijd {

  private final static String nu;
  
  static {
    Locale nl =new Locale("nl","NL");
    DateFormat df = new SimpleDateFormat("EEEE dd MMMM yyyy kk:mm:ss",nl);
    nu = df.format(new Date());
  }
  
  public static void main (String args[]) {
    System.out.println(nu);
  }
}