package com.prachi.algorithms;

public class UniqueString {

	public static boolean isUnique(String s) {
		boolean[] uniquechar = new boolean[26];		
		
		s = s.toLowerCase();
		for (int i = 0; i < s.length(); i++) {
			int val = s.charAt(i) - 'a';
			
			if (uniquechar[val]) {
				return false;
			}
			
			uniquechar[val] = true;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println("Is unique \"BACKUPp\": " + UniqueString.isUnique("BACKUPp"));
		System.out.println("Is unique \"Phone\": " + UniqueString.isUnique("Phone"));
	}
}