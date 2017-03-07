package wdsr.exercise1.logic;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
//import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;

public class CalculatorTest {
	private Calculator calculator;

	@Before
	public void setup() {
		calculator = new Calculator();
	}
	
	@Test
	public void testMin_shouldReturnTheOnlyValue() {
		// given
		int[] values = { -5 };
		
		// when
		int min = calculator.min(values);
		
		// then
		assertEquals(values[0], min);
	}
	
	@Test
	public void testMin_shouldReturnTheSmallestOfAllValues() {
		// given
		int[] values = { 2, -3, 5 };
		
		// when
		int min = calculator.min(values);
		
		// then
		assertEquals(-3, min);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testMin_shouldRaiseAnExceptionForNullArgument() {
		// given
		int[] values = null;
		
		// when
		calculator.min(values);
		
		// then
		// empty
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testMin_shouldRaiseAnExceptionForEmptyArgument() {
		// given
		int[] values = {};
		
		// when
		calculator.min(values);
		
		// then
		// empty
	}		
	
	@Test(expected=IllegalArgumentException.class)
	public void testMax_shouldRaiseAnExceptionForEmptyArgument() {
		// given
		int[] values = {};
		
		// when
		calculator.max(values);
		
		// then
		// empty
	}	
	
	@Test(expected=IllegalArgumentException.class)
	public void testMax_shouldRaiseAnExceptionForNullArgument() {
		// given
		int[] values = null;
		
		// when
		calculator.max(values);
		
		// then
		// empty
	}
	
	@Test
	public void testMaxn_shouldReturnTheOnlyValue() {
		// given
		int[] values = { -5 };
		
		// when
		Integer max = calculator.max(values);
		
		// then
		assertThat(max,is(values[0]));
	}
	
	@Test
	public void textMax_shouldReturnTheMaxValueFromMinus()
	{
	int[] values = { -2, -1, -5 };
		
		// when
		int max = calculator.max(values);
		
		// then
		assertThat(max, is(values[1]));
	}
	
	@Test
	public void textMax_shouldReturnTheMaxValueFromSameMinus()
	{
	int[] values = { -2, -2, -2 };
		
		// when
		int max = calculator.max(values);
		
		// then
		assertThat(max, is(values[1]));
	}
	
	@Test
	public void textMax_shouldReturnTheMaxValueFromPlusValues()
	{
	int[] values = { 2, 213, 53, 105, 303, 208 };
		
		// when
		int max = calculator.max(values);
		
		// then
		assertThat(max, is(303));
	}
	
	@Test
	public void textMax_shouldReturnTheMaxValueFromChars()
	{
	int[] values = { 'a', 'b', 'c', 'd', 'e', 'f' };
		
		// when
		int max = calculator.max(values);
		
		// then
		assertThat(max, is(102));
	}
}
