package com.grokking.algos.chap4.quicksort;

public class RecursiveSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,3,4,5,6,7};
		System.out.println(recursiveSum(arr));

	}
	
	private static int recursiveSum(int arr[]) {
	
		if(arr.length == 0) {
			return 0;
		}
		int newArr [] = new int[arr.length-1];
		for(int i=1;i<arr.length;i++) {
			newArr[i-1] = arr[i];
		}
		return arr[0] + recursiveSum(newArr);
	}

}
