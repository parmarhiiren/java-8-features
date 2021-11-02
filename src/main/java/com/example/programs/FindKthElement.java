package com.example.programs;

import java.util.*;

/**
 * Input : 0 1 0 1 1 1 1 0 1            K = 3         Output = null
 * Input : 9 3 2 7 2 5 3 8              K = 4         Output = 7
 *
 * Finding Kth element means the finding the kth smallest element in the array.
 * say K = 3 means find the 3rd smallest element
 *  so K = 4 means find the 4th smallest element
 *
 */
public class FindKthElement {

	public static void main(String[] args) {
		String input1 = "0 1 0 1 1 1 1 0 0 1";
		String input2 = "9 3 2 7 2 5 3 8";
		String[] inputArr1 = input1.split(" ");
		String[] inputArr2 = input2.split(" ");
		System.out.println(findKthElement(3, inputArr1)); // Find the 3rd smallest element
		System.out.println(findKthElement(4, inputArr2)); // Find the 4th smallest element
	}

	public static String findKthElement(int k, String[] array) {
		String val = "";
		// Sort and get unique elements
		Set<String> uniqueSet = new HashSet<String>(Arrays.asList(array));
		System.out.println(" uniqueSet " + uniqueSet + " Size = " + uniqueSet.size()); // [2, 3, 4, 8 ]
		// Check If kth element is bigger than size, return null
		if (k > uniqueSet.size()) {
			val = null;
		} else {
			// Convert to Array and Get the Kth element - 1 ( since Array starts with index 0 )
			val = uniqueSet.toArray()[k - 1].toString();
		}
		return val;
	}
}
