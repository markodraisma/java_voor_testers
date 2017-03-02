import java.util.Arrays;

public class ArrayHulp {

   public String[] toUpperCase(String[] words){
      for(int i=0;i<words.length;i++){
        if(words[i]!=null){
          words[i]=words[i].toUpperCase();
	}
      }
      return words;
   }

   public long sum(int ... values){
      long sum=0;
      for(int value:values){
        sum+=value;
      }
      return sum;
   }


   public int[] sort(int ... values){
      Arrays.sort(values);
      return values;
   }

}
