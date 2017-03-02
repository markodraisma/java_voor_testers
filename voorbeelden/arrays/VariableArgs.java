import org.junit.*;
import static org.junit.Assert.*;

public class VariableArgs {

  public static String commaSeparated(String... namen){
    return String.join(", ", namen);
  } 
  
  @Test 
  public void testNamenAaneenGeplakt() {
    String actual = commaSeparated("Kwik","Kwek","Kwak");
    String expected = "Kwik, Kwek, Kwak";
    assertEquals(actual,expected);
  } 
}

