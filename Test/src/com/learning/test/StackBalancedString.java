package com.learning.test;

import java.util.Stack;

public class StackBalancedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] inputs = { "{[()]}", "{[(])}", "{{[[(())]]}}" };
		for (String input : inputs) {
			boolean flag = checkBalancedString(input);
			if (flag) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}

	}

	private static boolean checkBalancedString(String input) {
		// Null Check
		if (input == null) {
			return false;
		}

		// STEP 1: Create a character stack
		Stack<Character> stack = new Stack<Character>();
		

		// STEP2: Traverse string as char array
		for (char c : input.toCharArray()) {
			// if character is opening brackets, push to stack
			switch (c) {
			case '{':
			case '(':
			case '[':
				stack.push(c);
				break;
			// if character is closing bracket, compare to stack or if stack becomes empty
			case ']':
				if (stack.isEmpty() || stack.pop() != '[')
					return false;
				break;
			case ')':
				if (stack.isEmpty() || stack.pop() != '(')
					return false;
				break;
			case '}':
				if (stack.isEmpty() || stack.pop() != '{')
					return false;
				break;
			}
		}
		return stack.isEmpty();
	}
}
