//Ittehad Qabid Java - Counting and Looping

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CountingLooping {

	public static void main(String[] args) {								//Scanner Class object to read input from User/keyboard
		int n = 0;															//initialize count to 1
		int sum = 0;														//Initialize sum to 1
		
		BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("Number of Times to Print: ");						// Asks the user the # of times to Print the phrase
			n = Integer.parseInt(bin.readLine());
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (int i = 1; i <= n; i++) {											//For Each i print the phrase the number of times in range
			System.out.println(i + "I LOVE COMPUTER SCIENCE!");				
			sum += i;
		}
		
		System.out.println("Printed This Message " + n + "times. The Sum of the Numbers from 1 to " + n + " is " + sum);	// Prints out the phrase from 1 to N times
	
		}
	}


