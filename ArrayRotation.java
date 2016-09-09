package com.grv;

public class ArrayRotation {
	
	
	public static void main(String args[]){
		
		
		int [] arr= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
		
		int k = 3;
		int [] aux= new int[k];
		//METHOD 1 START:   by simple shifting : O(n) atime nd O(k) space
		int l=arr.length;
		for(int i=0;i<arr.length;i++){
			
			if(i<l-k)
			{
				if(i<k){
					aux[i]=arr[i];
				}
				arr[i]=arr[i+k];
				
				
				
			}
			else{
				arr[i]=aux[i+k-l];
			}
			
			
			
			
		}
		
		
		// print rotated array
		System.out.println("rotated array is");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		//System.out.print(" ");
		
		
		
		// METHOD 1 [END]
		
		
		
		// METHOD 2
		
		//block swap algo 
		k=3;
		arr = swapBlock(arr, 0, k-1);
		arr=swapBlock(arr, k, l-1);
		arr=swapBlock(arr, 0, l-1);
		
		
		// print rotated array
		
		System.out.println("*******************************************************");
		System.out.println("rotated array is by block swap algo");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		//System.out.print(" ");
		
		
	}
	
	
	public  static int[] swapBlock(int []a, int start, int end){
		
		
		int i=start;
		int j= end;
		int temp;
		
		while(i<j){
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			
			i++;
			j--;
			
		}
		
		
		return a;
		
	}

}
