package com.Bridgelabz.stack;

import java.util.Scanner;

public class MyorderList {
	
	public static void main(String args[]) {
		String filePath = "Number.txt";
		String num[] = Utility.readFile(filePath);
		OrderedList<Integer> list = new OrderedList<Integer>();
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
			list.add(Integer.parseInt(num[i]));
		}
		System.out.println("Enter number to search");
		int numSearch = sc.nextInt();
		if (list.search(numSearch)) {
			System.out.println("Number is present");
			list.remove(numSearch);
		} else {
			System.out.println("Number added");
			list.add(numSearch);
		}

		num = new String[list.size()];
		for (int i = 0; i < list.size(); i++) {
			num[i] = String.valueOf(list.get(i));
			System.out.println(num[i]);
		}
		Utility.writeFile(num, filePath);
	}
}