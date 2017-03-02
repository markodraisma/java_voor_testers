import java.util.*;
import java.util.stream.*;
import java.util.function.*;

class Test {
  
 static  Function<Integer
                , BiFunction<Predicate<Integer> 
                            ,Function<Integer,Integer>
                            ,Integer>> mapper = 
    x ->  (y, z) -> y.test(x)? z.apply(x):x ;
  
  
  public static void main(String args[]){

    IntStream.range(1,20)
               .map(x -> mapper.apply(x).apply(y->y%2==0,a->a+1))
               .forEach(System.out::println);
    
  }

}

