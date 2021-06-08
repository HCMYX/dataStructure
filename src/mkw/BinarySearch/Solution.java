package mkw.BinarySearch;

public class Solution {


    public int search(int[] data,int target){
        int l = 0 ;
        int r = data.length;
        // 在data[l,r) 的范围内查找target
        while (l < r){
            int mid = l + (r - l) / 2;
            if (data[mid] == target){
                return mid;
            }
            if (data[mid] < target){
                //继续在 data [mid +1,r) 范围内寻找解
                l = mid + 1;
            }else {
                r = mid;
            }
        }
        return  -1;
    }
}
