package mkw.sort;

import java.util.Arrays;

/**
 * 自下而上的归并排序
 */
public class MergeSortBU {

    public static <E extends Comparable<E>> void sort(E[] arr){
        E[] temp = Arrays.copyOf(arr,arr.length);
        int n = arr.length;
        //遍历合并的区间长度
        for (int sz = 1; sz < n; sz += sz){
            //遍历合并两个区间的起始位置
            //合并 [i,i+sz-1]和[i+sz,i+sz+sz-1]
            for (int i = 0; i+sz < n ; i += (sz*2)){
                merge(arr,i,Math.min(i+sz+sz-1,n-1),i+sz-1,temp);
            }
        }
    }

    //合并两个有序区间 arr[l,mid] 和 arr[mid+1,r]
    private static <E extends Comparable<E>> void merge(E[] arr,int l,int r,int mid,E[] temp){
        System.arraycopy(arr,l,temp,l,r-l+1);
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
