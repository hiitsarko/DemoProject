package com.arko.test;

public class ArrayRev {

	public static void main(String[] args) {
		String[] temp = {"A","B","C"};
		int len = temp.length;
		String[] rev = new String[len]; 
        int j = len; 
        for (int i = 0; i < len; i++) { 
        	rev[j - 1] = temp[i]; 
            j = j - 1; 
        } 
        System.out.println("Reversed array is: \n"); 
        for (int k = 0; k < len; k++) { 
            System.out.println(rev[k]); 
        } 
	}

}
