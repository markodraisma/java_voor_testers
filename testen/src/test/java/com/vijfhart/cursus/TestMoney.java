package com.vijfhart.cursus;
import org.junit.*;
import static org.junit.Assert.*;
import java.util.Locale;
import java.util.Currency;

public class TestMoney {

  @Test 
  public void testNotNumeric(){
    try {
       Money money = new Money("1234567AC89.234");
       fail("this should produce an IllegalArgumentException");
    }
    catch(Exception e){
      assertTrue(e.getMessage().contains("numeric"));
      assertTrue(e instanceof IllegalArgumentException);
      assertTrue(e.getCause() instanceof NumberFormatException);
    }
  }

  @Test
  public void happyCaseUSA(){
    Locale locale = Locale.US;
    Locale.setDefault(locale);
    Money money = new Money("1234567.50");
    String actual = money.toCurrency();
    assertEquals("$1,234,567.50",actual);

  }

  @Test
  public void happyCaseNL(){
    Locale locale = new Locale("nl","NL");
    Locale.setDefault(locale);
    String euro = Currency.getInstance(locale).getSymbol();
    Money money = new Money("1234567.50");
    String actual = money.toCurrency();
    String expected = new StringBuilder(euro).append(" 1.234.567,50").toString();
    assertEquals(expected,actual);
  }


}
