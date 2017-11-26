package com.learning.test;

public class FindNumber {
	// Find number in an unsorted array

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 1 };
		int number = 5;
		System.out.println(findNumber(arr, number));

	}

	static String findNumber(int[] arr, int k) {
		
		// length check
		if (arr.length == 0) {
			return "NO";
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == k) {
				return "YES";
			}
		}
		return "NO";
	}

}
