package com.Bridgelabz.day16and17AlgorithmPrograms;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
	 	private static void swap(char[] chars, int i, int j) {
	        char temp = chars[i];
	        chars[i] = chars[j];
	        chars[j] = temp;
	 	}
	 
	    // Recursive function to generate all permutations of a string
	    private static void permutations(char[] chars, int currentIndex) {
	        if (currentIndex == chars.length - 1) {
	            System.out.println(String.valueOf(chars));
	        }
	 
	        for (int i = currentIndex; i < chars.length; i++) {
	            swap(chars, currentIndex, i);
	            permutations(chars, currentIndex + 1);
	            swap(chars, currentIndex, i);
	        }
	    }
	    
	    public static void findPermutationsRecursively(String str) {
	    	 
	        if (str == null || str.length() == 0) {
	            return;
	        }
	 
	        	permutations(str.toCharArray(), 0);
	    }

	    public static void PermutationsIteratively(String str) {
	    	if (str == null || str.length() == 0) {
	    		return;
	    	}
	    	List<String> partial = new ArrayList<>();
	    	partial.add(String.valueOf(str.charAt(0)));
	    	for (int i = 1; i < str.length(); i++)
	    	{
	    		for (int j = partial.size() - 1; j >= 0 ; j--)
	    		{
	    			String s = partial.remove(j);
	    			for (int k = 0; k <= s.length(); k++)
	    			{
	    				partial.add(s.substring(0, k) + str.charAt(i) + s.substring(k));
	    			}
	    		}
	    	}
	    	System.out.println(partial);
	    }
	    
	public static void main(String[] args) {
		
		 		String str = "XYZ";
		 		Permutation.findPermutationsRecursively(str);
		 		Permutation.PermutationsIteratively(str);
	}
}
