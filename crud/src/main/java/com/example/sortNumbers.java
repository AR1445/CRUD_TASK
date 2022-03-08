package com.example;

import java.util.Arrays;

public class sortNumbers {

	public static void main(String[] args) {
		int[] uoInt = {1,-2,3,-4,-1,5,6};
		int count = 1;
		int size = uoInt.length;
		int  temp = 0;
		try {	
       		   for (int i = 0; i < size; i++) {
            		if (uoInt[i] < 0) {
               		 if (i != count) {
                  	  temp = uoInt[i];
                  	  uoInt[i] = uoInt[count];
                  	  uoInt[count] = temp;
               		 }
              		  count++;
            	}
       	 }
		
		System.out.println(uoInt);
	
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
