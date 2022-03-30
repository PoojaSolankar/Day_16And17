package com.Bridgelabz.day16and17AlgorithmPrograms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class BinarySearchReadFile {
	public static int binarySearch(List<String> list, String x) {
		int l = 0;
		int r = list.size();
		while (l <= r) {
			int mid = l + (r - 1) / 2;
			int res = x.compareTo(list.get(mid));
			if (res == 0)
				return mid;
			if (res > 0)
				l = mid + 1;
			else
				r = mid - 1;
		}
		return -1;
	}

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		List<String> l = new ArrayList<String>();
		File file = new File("Binary_Search.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));

		String st;
		while ((st = br.readLine()) != null) {
			l.add(st);
		}
		System.out.println("Enter the name to Search");
		String x = sc.nextLine();
		Collections.sort(l);
		System.out.println(l);
		int val = binarySearch(l, x);
		if (val == -1)
			System.out.println("Name  not found");
		else
			System.out.println("found at position  " + val);
		
	}

}
