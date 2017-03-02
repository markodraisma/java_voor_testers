import java.util.*;

public class ComparatorApp 
{
  public static void main(String args[])
  {
    List<String> lijst = Arrays.asList(args);
    Comparator<String> mijnComparator = new MijnComparator(); // Comparator aanmaken
	Collections.sort(lijst, mijnComparator);                  // Sorteren met comparator
    System.out.println(lijst);
  }
}

class MijnComparator implements Comparator<String>   // Klasse implementeert Comparator
{
  public int compare(String s1, String s2)
  {
    return s1.compareToIgnoreCase(s2);     // Gebruik compareToIgnoreCase methode van
  }                                        // de String klasse als criterium
}
