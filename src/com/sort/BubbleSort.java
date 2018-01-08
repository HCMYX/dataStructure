package com.sort;

/**
 * 冒泡排序
 * @author mwb
 */
public class BubbleSort {

	public int[] sort(int[] intArr){
		int flag=0;
		for (int i = 1; i < intArr.length; i++) {
			for (int j = 0; j < intArr.length-i; j++) {
				if (intArr[j]>intArr[j+1]) {
					flag=intArr[j];
					intArr[j]=intArr[j+1];
					intArr[j+1]=flag;
				}
			}
		}
		return intArr;
	}
	
	public static void main(String[] args) {
		int[] arr=new int[]{10,2,5,2,6,3};
		BubbleSort b=new BubbleSort();
		arr=b.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+",");
		}
	}
}
