package com.grokking.algos.chap4.quicksort;

public class MaximumNumInAList {

	public static void main(String[] args) {

		int arr [] = {22,-2,-3,-4,-5,-6,-7,-8,-9};
		int max = Integer.MIN_VALUE;
		
		System.out.println(maxNuminList(max,arr));
	}
	
	private static int maxNuminList(int max,int arr[]) {
		if(arr.length==0) {
			return max;
		}else {
			if(arr[0]>max) {
				max=arr[0];
			}
			int newArr [] = new int[arr.length-1];
			for(int i=1;i<arr.length;i++) {
				newArr[i-1]=arr[i];
			}
			return maxNuminList(max,newArr);
		}
	}

}
