public class Parameters2 {

  public static void main(String args[]){
  
    Foo foo= new Foo();
    System.out.println("foo.bar voor: "+foo.bar);
    bewerk(foo);  
    System.out.println("foo.bar na:   "+foo.bar);
  }
 
  static void bewerk(Foo f) {
    f.bar=0;
  }
}

class Foo {
  int bar=1;
}