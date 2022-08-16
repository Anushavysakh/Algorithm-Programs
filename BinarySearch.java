package com.algorithmprograms.bridgelabz;

import java.util.ArrayList;

public class BinarySearch<T extends Comparable<T>> {

  
    int binarySearch(ArrayList<String> arr, String x)
    {
        int left = 0, right = arr.size() - 1;

        while (left <= right)
        {
            int mid = left + (right - left) / 2;
            if (x.compareTo(arr.get(mid)) == 0)
                return mid;

            if (x.compareTo(arr.get(mid))> 0)
                left = mid + 1;

            if (x.compareTo(arr.get(mid))< 0)
                right = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
    	
        BinarySearch obj = new BinarySearch();
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Mango");
        arr.add("Apple");
        arr.add("Orange");
        arr.add("Pineapple");
        String x = "Orange";
        String y = "Grape";
        // Printing elements of array list
        System.out.println("The elements of the arraylist are: "+arr);
        int result = obj.binarySearch(arr, x);
        int result2 = obj.binarySearch(arr, y);

        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("The Element " + x + " is found at "
                    + "index " + result);
        if (result2 == -1)
            System.out.println("Element not present");
        else
            System.out.println("The Element " + x + " is found at "
                    + "index " + result);
    }
}