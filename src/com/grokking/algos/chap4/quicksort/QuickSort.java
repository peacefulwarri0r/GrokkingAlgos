package com.grokking.algos.chap4.quicksort;

public class QuickSort {

	public static void main(String[] args) {

		int arr[] = {-2,-3,3,78,90,23,45,-234};
		int brr [] = quickSort(arr,arr.length);
		for(int i=0;i<brr.length;i++) {
			System.out.println(brr[i]);
		}

	}

	private static int[] quickSort(int arr[],int length) {

		if(length<2) {
			return arr;
		}else {
			int pivot = arr[0];

			int smallArr [] = new int[length];
			//smallArr[0]=pivot;

			int bigArr [] = new int[length];
			int s=0;
			int b=0;
			for(int i=1;i<length;i++) {
				if(arr[i]<pivot) {
					smallArr[s++] = arr[i];
				}else {
					bigArr[b++] = arr[i];
				}
			}
			
		

			return concatArray(quickSort(smallArr,s),pivot,quickSort (bigArr,b),s,b);
		}
	}

	private static int[] concatArray(int small[],int pivot,int big[],int s,int b) {

		int sortedArr [] = new int[s+b+1];
		int j=0;
		for(int i=0;i<s;i++) {
			sortedArr[j++] = small[i];
		}
		sortedArr[j++] = pivot;
		for(int i=0;i<b;i++) {
			sortedArr[j++] = big[i];
		}

		return sortedArr;

	}
}
