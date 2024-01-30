package com.ontariotechu.sofe3980U;
import org.joda.time.LocalTime;


/**
 * Hello world!
 *
 */
public class App 
{
	/**
	* Main program:  The entry point of the program. The local time will be printed first,
	*      Then it will create two binary variables, add them and print the result.
	*
	* @param args: not used
	*/
    public static void main( String[] args )
    {	
		System.out.println("\n");
		System.out.println("Binary Calculator");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	
		Binary binary1=new Binary("00010001000");
        System.out.println( " \nFirst binary number is "+binary1.getValue());
		Binary binary2=new Binary("111000");
        System.out.println( "Second binary number is "+binary2.getValue());
		Binary sum= Binary.add(binary1,binary2);
		System.out.println( "\nTheir summation is "+sum.getValue());
		Binary MULTIPLY= Binary.Multiply(binary1,binary2);
		System.out.println( "Their product is "+MULTIPLY.getValue());
		Binary or= Binary.OR(binary1,binary2);
		System.out.println( "Their OR is "+or.getValue());
		Binary and= Binary.AND(binary1,binary2);
		System.out.println( "Their AND is "+and.getValue());
    }
}