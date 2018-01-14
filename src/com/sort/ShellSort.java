package com.sort;

/**
 * shell排序
 * 
 * @author mwb
 */
public class ShellSort {
	public int[] sort(int[] arr) {
		int temp;
		int j;
		for (int r = arr.length/2;r>=1;r=r/2) {
			for (int i=r; i < arr.length;i++) {
				temp=arr[i];
				j=i-r;
				while(j>=0&&temp<arr[j]){
					arr[j+r]=arr[j];
					j-=r;
				}
				arr[j+r]=temp;
				for (int k = 0; k < arr.length; k++) {
					System.out.print(arr[k]+",");
				}
				System.out.println("");
			}
			System.out.println("-----");
		}
		return arr;
	}
	public static void main(String[] args) {
		int[] arr=new int[]{1,5,10,4,0,2,7,9,6,3};
		ShellSort b=new ShellSort();
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k]+",");
		}
		System.out.println("--");
		arr=b.sort(arr);
	}
}
