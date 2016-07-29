package com.grv.miscellaneous;

public class NumbersUsingTwoThreads {

	
	
	public static void main (String a[])throws InterruptedException
	{
		
		
	Thread t1= new Thread(){
			public void run(){
				for(int i=0;i<21;i=i+2)
				{
					System.out.println(i);
					try {
						Thread.currentThread().sleep(1000);
					
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
				}
			}
		};
		Thread t2= new Thread(){
			public void run(){
				for(int i=1;i<21;i=i+2)
				{
					System.out.println(i);
					try {
						Thread.currentThread().sleep(1000);
						//Thread.currentThread().join();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					//System.out.println(i);
				}
			}
		};
		t1.start();
		//t1.wait();
		t2.start();
		//t2.wait();
		
		// Thread.currentThread().join();
		
	}
}
