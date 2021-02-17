package mkw.selectionSort;

import mkw.util.ArrayGenerator;

/**
 * 选择排序
 */
public class SelectionSort {
    private SelectionSort(){}

    /**
     * 排序
     * @param arr
     */
    public static <E extends Comparable<E>> void sort(E[] arr){
        for (int i = 0;i<arr.length;i++){
            int minIndex = i;
            for (int j = i; j<arr.length; j++){
                if (arr[j].compareTo(arr[minIndex]) < 0){
                    minIndex = j;
                }
            }
            swap(arr,i,minIndex);
        }
    }
    /**
     * 倒着选择排序
     * @param arr
     */
    public static <E extends Comparable<E>> void sort2(E[] arr){
        for (int i = arr.length-1;i>= 0;i--){
            int minIndex = i;
            for (int j = i-1; j>= 0; j--){
                if (arr[j].compareTo(arr[minIndex]) > 0){
                    minIndex = j;
                }
            }
            swap(arr,i,minIndex);
        }
    }

    private static <E> void swap(E[] arr, int i, int j){
        E a = arr[i];
        arr[i] = arr[j];
        arr[j] = a;
    }

    public static void main(String[] args) {
        Integer[] arr = ArrayGenerator.generateRandomArray(20,50);
        SelectionSort.sort(arr);
        for (int e : arr){
            System.out.print(e+" ");
        }
        System.out.println();
        SelectionSort.sort2(arr);
        for (int e : arr){
            System.out.print(e+" ");
        }
    }

}
