package com.Bridgelabz.day16and17AlgorithmPrograms;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string");
		String string1 = sc.next();
		System.out.println("Enter second string");
		String string2 = sc.next();

		Anagram anag1 = new Anagram();
		anag1.isAnagram(string1, string2);

	}

	public void isAnagram(String one, String two) {
		char str1Array[] = one.toCharArray();
		char str2Array[] = two.toCharArray();

		sortMethod(str1Array);
		sortMethod(str2Array);

		one = new String(str1Array);
		two = new String(str2Array);

		if (one.equals(two))
			System.out.println(" They are anagrams");
		else
			System.out.println(" They are not anagrams");

	}

	public static void sortMethod(char[] array) {
		char temp;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > (array[j + 1])) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}
}
