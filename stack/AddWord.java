package com.Bridgelabz.stack;

import java.util.Scanner;

public class AddWord {
	public static void main(String[] args) {
		String filePath="Binary_Search.txt";
		String words[]=Utility.readFile(filePath);
		UnorderedList<String> linklist=new UnorderedList<>();
		for(int i=0;i<words.length;i++){
			linklist.add(words[i]);
		}
		linklist.printList();
		System.out.println("Enter word to add");
		Scanner scanner=new Scanner(System.in);
		String add = scanner.next();
		
		
		if(linklist.search(add)){
			System.out.println("Word is already present in linked list");
		}else {
			Utility.appendFile(add,filePath);
			System.out.println("Word Added to list");
		}
		
		
	}


}