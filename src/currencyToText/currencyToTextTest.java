package currencyToText;

import static org.junit.Assert.*;
import currencyToText.currencyToText;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.equalTo;

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
	       //if (doubleValue == 0)
	    	 //  assertThat(result, is("Rs. Twelve Thousand Three Hundred and Forty Five Only"));
	 }
}
