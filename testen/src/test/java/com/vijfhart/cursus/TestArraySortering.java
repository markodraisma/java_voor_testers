package com.vijfhart.cursus;
import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
public class TestArraySortering {
	@Test
  public void testSortering(){
    String[] woorden = { "dit", "is", "een", "test" };
    Arrays.sort(woorden);
    String[] expected = { "dit", "een", "is", "test" };
    assertArrayEquals(expected, woorden);
  }
}
