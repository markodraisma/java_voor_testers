public class Parameters1 {

  public static void main(String args[]){
  
    int foo = 1;
    System.out.println("Foo voor: "+foo);
    bewerk(foo);  
    System.out.println("Foo na:   "+foo);
  }
 
  static void bewerk(int f) {
    f=0;
  }
}

