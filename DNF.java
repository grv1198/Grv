package com.grv.miscellaneous;

public class DNF {





	public static void main(String args[]){


		int arr[]= {0,1,2,2,0,1,2,1,0,0,2,1};
		DNF obj= new DNF();
		arr= obj.sortDNF(arr, arr.length);

		for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);

	}


	public int [] sortDNF(int[] arr,int size){


		int high=size-1;

		int low=0;
		int mid=0;
		int temp;

		while (mid<=high){

			switch(arr[mid]){
			case 0: 
				//swap mid nd low, incremenr mid n low

				if(arr[mid]!=arr[low]){

					temp=arr[mid];
					arr[mid]=arr[low];
					arr[low]=temp;
				}
					low++;
					mid++;
				
				break;
			case 1 :
				mid++;

				break;
			case 2:
				
				
				if(arr[mid]!=arr[high]){

					temp=arr[mid];
					arr[mid]=arr[high];
					arr[high]=temp;
				}
					high--;
					//mid++;
				


				break;


			}


		}

		return arr;

	}


}
