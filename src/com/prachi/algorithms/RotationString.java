package com.prachi.algorithms;

public class RotationString {

    public boolean isRotation(String s1, String s2){
        int len = s1.length();
        if(len == s2.length() && len > 0){
            String s1s1 = s1 + s1;
            return isSubString(s1s1, s2);	
        }		
        return false;
    }

    private boolean isSubString(String s1s1, String s2) {
        if(s1s1.contains(s2)) return true;	
        return false;
    }

    public static void main(String[] args) {
        RotationString str = new RotationString();
        System.out.println(str.isRotation("apple", "plepp"));
        System.out.println(str.isRotation("apple", "leapp"));
    }
}
