package com.grv.miscellaneous;

public class Anagrams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String s1= "madmad";
		String s2= "damdam";
		
		
		
		 System.out.println(isAnagram(s1, s2));
		
		
		

	}
	
	public static Boolean  isAnagram(String s1, String s2){
		
		int count1[] = new int[256];
		int count2[]= new int[256];
		Boolean flag= true;
		for(int i=0;i<s1.length();i++){
			
			Character c= s1.charAt(i);
			count1[Character.toLowerCase(c)]++;
			
		}
		
		for(int i=0;i<s2.length();i++){
			
			Character c= s2.charAt(i);
			count2[Character.toLowerCase(c)]++;
			
		}
		
		for(int i=0;i<256;i++){
			
			if(count1[i]!=count2[i]) flag=false;
		}
		
		return flag;
	}

}
