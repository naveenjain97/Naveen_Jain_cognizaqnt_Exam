//Quetion


package com.test.cts;
import java.util.Scanner;
public class Java2 {

	public void two(int num){
		int original=num;
		int div=0;
		int rem=0;
		
		 int result=0;
		
		 for(int i=0;i<2;i++)
		 {
			 
			  rem=num%10;
			 div=num/10;
			 if(rem>div)
			 result=rem-div;
			 else
				 result=div-rem;
			 
			 
		 }
		System.out.println(result+""+rem);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the two consecutive only for Two Digit ");
		Scanner Sc=new Scanner(System.in);
		
		int num =Sc.nextInt();
		Java2 j=new Java2();
		j.two(num);

	}
}

