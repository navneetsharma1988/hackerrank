package com.learning.test;

import java.util.ArrayList;
import java.util.List;

public class FindOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l = 3;
		int r = 9;

		System.out.println(oddNumbers(l, r));

	}

	static int[] oddNumbers(int l, int r) {

		List<Integer> list = new ArrayList<Integer>();
		for (int i = l; i <= r; i++) {
			if (i % 2 != 0) {
				list.add(i);
			}
		}

		int[] array = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			array[i] = list.get(i);
		}

		return array;

	}

}
