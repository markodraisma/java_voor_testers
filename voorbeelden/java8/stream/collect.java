import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

class Test {

  public static void main(String args[]){

    List<String> list = Stream.of(args)
                         .filter(s->s.length()>3)
                         .collect(toList());
    list = list.stream()
               .filter(s->s.length()<6)
               .collect(toCollection(LinkedList::new));
    System.out.println(list.stream()
                           .collect(
                             joining(", ", "gevonden: ", ".")
                           )
                      );
    Map<Boolean,List<Integer>> map = IntStream.range(0,10)
                                              .mapToObj(Integer::new)
                                              .collect(
                                               partitioningBy(x->x%2==0)
                                               );
    System.out.println(map.get(true)
                          .stream()
                          .map(Object::toString)
                          .collect(
                           joining(", ", "even: ", ".")
                           ));

   Map<Integer,Long> map2 = Stream.of(args)
                                         .collect(
                                          groupingBy(s -> s.length()
                                          , counting())
                                         );
//   System.out.println(map2.get(4));
   map2.entrySet()
       .stream()
       .forEach( es -> System.out.printf("%s woorden van %s lang%n"
                                         ,es.getValue()
                                         ,es.getKey()));


  }

}

