package com.prachi.algorithms;

public class OneEditAway {

	public static boolean oneEditAway(String str1, String str2){
		if(str1.length()==str2.length())
			return oneEditReplace(str1,str2);
		if(str1.length()-1== str2.length())
			return oneEditInsert(str2,str1);
		if(str1.length()+1== str2.length())
			return oneEditInsert(str1,str2);
		return false;
	}

	public static boolean oneEditInsert(String str1, String str2) {
		int index1=0;
		int index2=0;

		while(index2 < str2.length() && index1 < str1.length()){
			if(str1.charAt(index1)!=str2.charAt(index2)){
				if(index1!=index2){
					return false;
				}
				index2++;
			}else{
				index1++;
				index2++;
			}
		}

		return true;
	}

	public static boolean oneEditReplace(String str1, String str2) {
		int count=0;
		for(int i =0;i < str1.length();i++){
			if(str1.charAt(i)!=str2.charAt(i)){
				count++;
			}
		}
		
		if(count == 1) return true;
		return false;
	}

	public static void main(String[] args) {
		System.out.println(OneEditAway.oneEditAway("prchi","pchi"));
		System.out.println(OneEditAway.oneEditAway("car","cars"));
		System.out.println(OneEditAway.oneEditAway("eat","ate"));
	}
}
