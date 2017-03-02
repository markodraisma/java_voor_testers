abstract class Formatter {

  abstract String format(int x);

  static Formatter getInstance(int low, int high) {
    class DefaultFormatter extends Formatter {
      public String format (int x) {
        int range = high-low;
        double percent = (double)(x - low)/range*100;
        return String.format("%s %%",(int)percent);
      }
    }
    return new DefaultFormatter();
  }

}

class Test {
  public static void main (String args[]){
    Formatter f = Formatter.getInstance(
       Integer.parseInt(args[0]),
       Integer.parseInt(args[1]));
    System.out.println(f.format(Integer.parseInt(args[2])));
  }
}
