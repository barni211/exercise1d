package wdsr.exercise1.logic;

import wdsr.exercise1.conversions.ArrayConverter;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
//import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;


public class ArrayConverterTest {
	private ArrayConverter converter;

	@Before
	public void setup() {
		converter = new ArrayConverter();
	}
	
	@Test
	public void testConvertToInts_shouldReturnTheIntValue() {
		// given
		String[] values = { "-5", "15" };
		
		// when
		int[] valuesInt = converter.convertToInts(values);
		
		// then
		int result = -5;
		assertThat(result,is(valuesInt[0]));
	}
	
	@Test
	public void testConvertToInts_shouldReturnTheIntTableValue() {
		// given
		String[] values = { "-5", "15", "13" };
		int[] expected = {-5, 15, 13};
		
		// when
		int[] result = converter.convertToInts(values);
		
		// then
		
		assertThat(result,is(expected));
	}
	
	@Test(expected=NullPointerException.class)
	public void testConvertToInts_shouldRaiseNullPointerExceptionForNullArgument() {
		// given
		String[] values = null;
		
		// when
		int[] valuesInt = converter.convertToInts(values);
		
		// then
	
	}
	
	@Test(expected=NumberFormatException.class)
	public void testConvertToInts_shouldRaiseNumberFormatExceptionForNotIntArgument() {
		// given
		String[] values = {"3", "5", "rito"};
		
		// when
		int[] valuesInt = converter.convertToInts(values);
		
		// then
		// empty
	}	
	

	
}
