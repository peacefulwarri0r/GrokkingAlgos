package com.grokking.algos.chap4.quicksort;

public class CountItemsInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr [] = {1,2,3,4,5,6,8,9};
		int count = 0;
		System.out.println(countItems(count,arr));

	}
	
	public static int countItems(int count,int arr[]) {
		
		if(arr.length == 0) {
			return count;
		}else{
			count ++;
			int [] newArr = new int[arr.length-1];
			for(int i=1;i<arr.length;i++) {
				newArr[i-1] = arr[i];
			}
			return countItems(count,newArr);
		}
	}

}
