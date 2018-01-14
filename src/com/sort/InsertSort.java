package com.sort;

/**
 * 插入排序
 * @author mwb
 *
 */
public class InsertSort {
	public int[] sort(int[] arr){
		int t;
		int j;
		for (int i = 1; i < arr.length; i++) {
			t=arr[i];
			j=i-1;
			while(j>=0&&t<arr[j]){
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=t;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr=new int[]{10,2,5,2,6,3};
		InsertSort b=new InsertSort();
		arr=b.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+",");
		}
	}
}
