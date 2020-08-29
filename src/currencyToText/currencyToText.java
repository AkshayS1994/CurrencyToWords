package currencyToText;

import java.util.*;
import java.io.*;
public class currencyToText
{
	private static final String EMPTY = "";

	private static final String[] X ={ EMPTY, "One", "Two", "Three", "Four", "Five", "Six",
	"Seven ", "Eight ", "Nine", "Ten", "Eleven","Twelve",
	"Thirteen ", "Fourteen ", "Fifteen ", "Sixteen ",
	"Seventeen", "Eighteen ", "Nineteen "};

	private static final String[] Y = {EMPTY, EMPTY, "Twenty ", "Thirty ", "Forty ", "Fifty ",
	"Sixty ", "Seventy ", "Eighty ", "Ninety " };

	private static String convertToDigit(int n, String suffix)
	{
		if (n == 0)
		{
			return EMPTY;
		}

		if (n > 19)
		{
			return Y[n / 10] + X[n % 10] + suffix;
		}
		else
		{
			return X[n] + suffix;
		}
	}

	public static String convert(int n)
	{
		StringBuilder res = new StringBuilder();

		res.append(convertToDigit(((n / 100000) % 100), " Lakh, "));

		res.append(convertToDigit(((n / 1000) % 100), " Thousand "));

		res.append(convertToDigit(((n / 100) % 10), " Hundred "));

		if ((n > 100) && (n % 100 != 0))
		{
			res.append("and ");
		}

		res.append(convertToDigit((n % 100), ""));
		return res.toString();
	}

		public static void main(String[] args)
		{
			Double doubleValue;
			int n;
			System.out.println("\nEnter a number : ");
			Scanner sc = new Scanner(System.in);
			doubleValue = sc.nextDouble();
			if(doubleValue == 0)
			{
				System.out.println("Rs. Zero Only");
				System.exit(1);
			}
			else if ( doubleValue > 999999.99 )
			{
				System.out.println("Reached Max Value");
				System.exit(1);
			}
			String numberStr = Double.toString(doubleValue);
			String fractionalStr = numberStr.substring(numberStr.indexOf('.')+1);
			int fractional = Integer.valueOf(fractionalStr);
			n = (int)Math.round(doubleValue);

			if (fractional > 50)
				n = n - 1;

			if (fractional == 0)
			{
				System.out.println(" Rs.  " + convert(n) + " Only" ) ;
				
			}
			else
				System.out.println(" Rs. " + convert(n)  + " " + fractional + "/100" + " only");
		}
}


