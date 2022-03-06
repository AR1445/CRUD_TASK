package com.example;

import java.util.Arrays;

public class sortNumbers {

	public static void main(String[] args) {
		try {
			int[] uoNumber = {-1,2,-3,4,-5};
			Arrays.parallelSort(uoNumber);
			 Arrays.stream(uoNumber).forEach(n -> System.out.print(n + " "));
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
