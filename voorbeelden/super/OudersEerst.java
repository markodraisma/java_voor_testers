public class OudersEerst {

   public static void main(String args[]){
     Kind kind = new Kind();
   }
}

class Grootouder {
  Grootouder(){
    System.out.println("Grootouder");
  }
}

class Ouder extends Grootouder {
  Ouder(){
    System.out.println("Ouder");
  }
}

class Kind extends Ouder {
  Kind(){
    System.out.println("Kind");
  }
}