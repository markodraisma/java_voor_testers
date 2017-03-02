import java.util.Arrays;

public class SorteerApp {

  public static void main(String args[]) {
    String[] invoer = Arrays.copyOf(args,args.length);
    Arrays.sort(invoer);
    System.out.println(Arrays.toString(invoer));
  }
}