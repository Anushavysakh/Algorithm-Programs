package com.algorithmprograms.bridgelabz;

import java.util.Arrays;

public class InsertionSort {

	 public static void main(String[] args){
	        String[] arr ={"Orange","Pineapple","Apple","Lemon","Banana"};
	        int count = 0;
	        for(int i=0;i<arr.length;i++){
	            System.out.println(Arrays.asList(arr[i]));
	        }
	        String sortedArray[] = sort_sub(arr, arr.length);
	        for(int i=0;i<sortedArray.length;i++){
	            System.out.println(sortedArray[i]);
	        }
	    }

	    public static String[] sort_sub(String array[], int size){
	        String temp="";
	        for(int i=0;i<size;i++){
	            for(int j=i+1;j<size;j++){
	                if(array[i].compareToIgnoreCase(array[j])>0){
	                    temp = array[i];
	                    array[i]=array[j];
	                    array[j]=temp;
	                }
	       //         System.out.print(Arrays.asList(array[i])+" ");
	            }
	        }
	        return array;
	    }
}
