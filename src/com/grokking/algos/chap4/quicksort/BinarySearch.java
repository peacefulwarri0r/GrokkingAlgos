package com.grokking.algos.chap4.quicksort;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {-5,-3,2,3,4,6,7,8,9};//sorted array
		int first =0;
		int last = arr.length-1;
		int num = 8;
		System.out.println(binarySearch(arr, first, last, num));

	}
	
	private static int binarySearch(int arr[],int first,int last,int num) {
		
		int mid = (first+last)/2;
		
		if(arr[mid]==num) {
			return mid;
		}else if(arr[mid]>num){
			return binarySearch(arr,first,mid-1,num);
		}else {
			return binarySearch(arr,mid+1,last,num);
		}
	}

}
