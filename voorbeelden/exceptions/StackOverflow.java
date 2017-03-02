public class StackOverflow {
  
  static int teller=0;
  
  public static void main(String args[]){
    test();
  }
  
  private static void test(){
    try{
    System.out.println("test heeft zichzelf "+ teller+" keer aangeroepen.");
    teller++;
    test();
    }
    catch(StackOverflowError soe){
        System.err.println("StackOverflowError: test() is te diep genest.");
    }
  }
  
}