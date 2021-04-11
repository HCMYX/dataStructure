package mkw.sort.MergeSort;

import com.sun.corba.se.spi.extension.CopyObjectPolicy;
import mkw.array.Array;
import mkw.util.ArrayGenerator;

import java.util.Arrays;

/**
 * 归并排序
 */
public class MergeSort {

    private MergeSort(){}

    public static void main(String[] args) {
        int n = 100;
        Integer[] arr = ArrayGenerator.generateRandomArray(n,n);
        sort(arr);
    }
    public static <E extends Comparable<E>> void sort(E[] arr){
        sort(arr,0,arr.length - 1);
    }

    private static <E extends Comparable<E>> void sort(E[] arr,int l ,int r){
        if (l >= r){
            return;
        }
        int mid = (l + r)/2;
        sort(arr,l,mid);
        sort(arr,mid+1,r);
        merge(arr,l,r,mid);
    }

    //合并两个有序区间 arr[l,mid] 和 arr[mid+1,r]
    private static <E extends Comparable<E>> void merge(E[] arr,int l,int r,int mid){
        E[] temp  = Arrays.copyOfRange(arr,l,r+1);
        int i = l ,j = mid + 1;
        for (int k = 0; k <= r; k++){
            if (i > mid){
                arr[k] = temp[j - l];
                j ++;
            }else if (j > r){
                arr[k] = temp[i - l];
                i++;
            }else if(temp[i-l].compareTo(temp[j-l]) <=  0){
                arr[k] = temp[i - l];
                i++;
            }else {
                arr[k] = temp[j - l];
                j++;
            }
        }
    }
}
