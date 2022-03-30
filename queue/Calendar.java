package com.Bridgelabz.queue;

public class Calendar {
	public static void main(String[] args) {
		int month=Integer.parseInt(args[0]);
		int year=Integer.parseInt(args[1]);
		String days[][] = new String[6][6];
		Utility.fillArray(days,month,year);
		Utility.printCalender(days,month,year);
	}

}