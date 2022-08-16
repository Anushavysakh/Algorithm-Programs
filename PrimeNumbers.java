package com.algorithmprograms.bridgelabz;

public class PrimeNumbers {

	 public static void main(String[] args) {
	        int count=0;
	        System.out.println("welcome to prime number program. Printing prime numbers from 0 to 1000.");
	        System.out.print(2+" ");
	        for (int i=2;i<1000;i++){
	            for(int j=2;j<i;j++){
	                if(i%j==0){
	                    count=0;
	                    break;
	                }else{
	                    count++;
	                }
	            }
	            if(count>0) {
	                System.out.print(i+" ");
	            }
	        }
	 }
}

