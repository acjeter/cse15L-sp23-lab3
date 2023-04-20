import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test
  public void testReversed() {
    int[] input4 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input4));
  }
  // Reversed test creaded 
  @Test
  public void testReversed2() {
    int[] input2 = {1, 2, 3};
    assertArrayEquals(new int[]{3, 2, 1}, ArrayExamples.reversed(input2));
  }
  // Reversed In Place test
  @Test
  public void testReverseInPlace2() {
    int[] input3 = {6, 7, 8, 9};
    ArrayExamples.reverseInPlace(input3);
    assertArrayEquals(new int[]{ 9, 8, 7, 6 }, input3);
  }

  @Test
  public void testAverageWithoutLowest() {
    double[] input5 = { 4, 4, 4, 4, 4 };
    double answer1 = ArrayExamples.averageWithoutLowest(input5);
    assertEquals(4.0, answer1, 0.1);
  }

  @Test
  public void testAverageWithoutLowest2() {
    double[] input6 = { 5.0, 10.0, 2.0 };
    double answer2 = ArrayExamples.averageWithoutLowest(input6);
    assertEquals(7.5, answer2, 0.1);
  }
}
