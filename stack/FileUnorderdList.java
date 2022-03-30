package com.Bridgelabz.stack;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileUnorderdList {
	
//		static void word(String s1 ,UnorderedList<String> list) {
//		System.out.println(list.size()); if (list.search(s1)) { list.remove(s1);
//		System.out.println(list); } }
	 
	public static void main(String[] args) {

		try {
			File f1 = new File("Number.txt");
			UnorderedList<String> list = new UnorderedList<>();
			Scanner sf = new Scanner(f1);
			Scanner s = new Scanner(System.in);
			while (sf.hasNext()) {
				list.add(sf.next());
			}
			System.out.println(list);
			
			FileWriter fw = new FileWriter(f1);
			System.out.println("enter a word ");
			String s1 = s.nextLine();
			System.out.println(list.size());
			
			if (list.search(s1)) {
				list.remove(s1);
				int n = 0;
				while (n < list.size()) {
					fw.write(list.pop(0) + " ");
					fw.flush();
					n++;
				}
				System.out.println("found and deleted");
				
			} else {
				list.add(s1);
				int n = 0;
				while (n < list.size()) {
					fw.write(list.pop(0) + " ");
					fw.flush();
					n++;
				}
				System.out.println("added and saved");
				fw.close();
				s.close();
			}

		} catch (FileNotFoundException e) {
			System.out.println("file not found");
		} catch (IOException e) {
			System.out.println("io excep");
		}
	}
}


