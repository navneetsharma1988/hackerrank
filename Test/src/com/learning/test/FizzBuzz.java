package com.learning.test;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	public static void main(String[] args) {

		int arr[] = { 5, 5, 5, 7, 7, 3, 4, 7 };
		// TODO Auto-generated method stub
		System.out.println(packNumbers(arr));

	}

	static String[] packNumbers(int[] arr) {
		int count = 0;
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < arr.length; i++) {
			String str = String.valueOf(arr[i]);
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					count++;
					str = str + ":" + count;
				}
			}
			list.add(str);

		}

		
		String [] res = list.toArray(new String[list.size()]);
		
		
		return res;

	}

}
