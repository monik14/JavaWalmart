package assignment;

/**
 * @author $$ Monik Vyas $$
 *
 */
//I have developed a Java program to Reverse a given string using ByteArray and asking user to input string using Scanner class
//The time complexity depends on the way you write your code. O(n) or O(n/2). If we use more for loops than the complexity will be high.

import java.lang.*;
import java.io.*;
import java.util.Scanner;

//Class of Reversing

class Reversing
{
	public static void main(String[] args)
	{		
		Scanner scanner = new Scanner( System.in );
		System.out.print( "Enter the string that you want to reverse: " );
		String input = scanner.nextLine();
		System.out.println( "input = " + input );
		scanner.close();

		// getBytes() method to convert string 
		// into bytes[].
		byte [] byteArrayFromStr = input.getBytes();

		byte [] finalResult = new byte [byteArrayFromStr.length];

		// Store result in reverse order into the finalResult byte[]
		for (int i = 0; i<byteArrayFromStr.length; i++)
			finalResult[i] = byteArrayFromStr[byteArrayFromStr.length-i-1];

		System.out.println(new String(finalResult));
	}
}
