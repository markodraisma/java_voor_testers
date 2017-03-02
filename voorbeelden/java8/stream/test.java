import java.util.*;
import java.util.stream.*;
import java.util.function.*;

class test {
  
  
  public static void main(String args[]){

    Function<Integer,Function<BiPredicate<Integer,Integer>,Function<BiFunction<Integer,Integer,Integer>,Integer>>>
    mapper;
    

    Function<Integer,Function<BiPredicate<Integer,Integer>,BiFunction<Integer,Integer,Integer>>> 
    tester  = x -> y ->(a,b) -> y.test(a,b)? a-b: b-a;

    Function<Integer,Function<BiPredicate<Integer,Integer>,Function<BiFunction<Integer,Integer,Integer>,Integer>>> 
    tester2 = x -> y -> (a,b) -> y.test(a,b)? z -> (c,d) -> z.apply(a,b):  z-> (c,d) -> z.apply(d,c);


    Stream.of(5,3,2,6,4,8)
          .map(x -> tester.apply(x).apply((a,b)->a>b).apply(5,x))
//               .map(x -> mapper.apply(x).apply((a,b) -> a>b ).apply((c,d)->c-d))
               .forEach(System.out::println);
    
  }

}

