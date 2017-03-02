import java.math.BigDecimal;
import java.text.*;

public class Money {

  private final BigDecimal value;

  public Money(String value){
    try{
      this.value = new BigDecimal(value);
    } catch(NumberFormatException nfe){
      throw new IllegalArgumentException("Input must be numeric", nfe); 
    }
  }

  public String toCurrency(){
     if(value.scale()>2){
        throw new IllegalArgumentException("Input should have 2 decimals at the most");
     }
     if(value.toBigInteger().toString().length()>12){
        throw new IllegalArgumentException("This ammount is insane");
     }
     NumberFormat formatter = NumberFormat.getCurrencyInstance();
     return formatter.format(value);
  }

}
