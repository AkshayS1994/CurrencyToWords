package currencyToText;

import static org.junit.Assert.*;
import currencyToText.currencyToText;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class currencyToTextTest {

	@Test
	    public void Integer() throws Exception {
	       String result = currencyToText.convert(12345);
	       result = "Rs. " + result + " Only" ;
	       assertThat(result, is("Rs. Twelve Thousand Three Hundred and Forty Five Only"));
	 } 
	 @Test
	    public void Zero() throws Exception {
		 	String resultForZero = currencyToText.convert(0);
		 	resultForZero = "Rs. " + resultForZero + " Only" ;
	    	assertThat(resultForZero, is("Rs. Zero Only"));
	 }
	 
	 @Test
	 public void MinusValue() throws Exception {
		 	String resultForZero = currencyToText.convert(-12);
		 	resultForZero = "Rs. " + resultForZero + " Only" ;
	    	assertThat(resultForZero, is("Rs. Negative Numbers not allowed Only"));
	 }
	 
	/* Note :  As the currencyToText.convert() takes integer only 
	 * 	there is no need to check string inputs as it will give compilation errors */
}
