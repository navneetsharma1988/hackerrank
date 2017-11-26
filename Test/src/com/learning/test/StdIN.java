package com.learning.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StdIN {

	// Using Scanner class

	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * // Read input from console Scanner scanner = new Scanner(System.in); String
	 * myString = scanner.next(); int myInt = scanner.nextInt();
	 * 
	 * scanner.close();
	 * 
	 * System.out.println("Input string is " + myString);
	 * System.out.println("Input Int is " + myInt);
	 * 
	 * }
	 */

	// Using BufferedReader
	public static void main(String[] args) {

		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter some string");
			String inputString = br.readLine();
			System.out.println("Input String is " + inputString);
			
			System.out.println("Enter a number");
			int inputNumber = Integer.parseInt(br.readLine());
			System.out.println("Input number is " + inputNumber);
			System.exit(0);
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException ex) {
					ex.printStackTrace();
				}
			}
		}
	}

}
