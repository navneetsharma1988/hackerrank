package com.learning.test;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String a = scanner.next();
		String b = scanner.next();

		scanner.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");

	}

	static boolean isAnagram(String a, String b) {
		// STEP 1: Null check
		if (a == null || b == null) {
			return false;
		}

		// STEP 2: Length check
		if (a.length() != b.length()) {
			return false;
		}

		// STEP 3: Remove spaces & Convert to Uppercase
		a = a.replaceAll("\\s", "").toUpperCase();
		b = b.replaceAll("\\s", "").toUpperCase();

		// STEP 4: Converts string to char[] array
		char[] c1 = a.toCharArray();
		char[] c2 = b.toCharArray();
		
		// STEP 5: Sort both array
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		return Arrays.equals(c1, c2);
		
	}

}
