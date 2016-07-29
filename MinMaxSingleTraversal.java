package com.grv.miscellaneous;

public class MinMaxSingleTraversal {

	
	
	
	public static void main(String args[]){
		
		MinMaxSingleTraversal obj= new MinMaxSingleTraversal();
		int arr[]= {9,100,72,87,92, 6, 37};
		obj.printMinMax(arr);
		
	}
	
	public void printMinMax(int [] a){
		
		
		int min=a[0];
		int max=a[0];
		
		for(int i=0;i<a.length;i++){
			
			if(a[i]<min) min=a[i];
			if(a[i]>max)max= a[i];
			
		}
		
		
		System.out.println("Minimum is="+ min);
		System.out.println("Maximum is ="+ max);
	}
}
