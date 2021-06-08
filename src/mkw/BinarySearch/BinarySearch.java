package mkw.BinarySearch;

/**
 * 二分查找
 */
public class BinarySearch {

    private BinarySearch() {
    }

    /**
     * 非递归的方式
     * @param data
     * @param target
     * @param <E>
     * @return
     */
    public static <E extends Comparable<E>> int search(E[] data,E target){
        int l = 0 ;
        int r = data.length - 1;

        while (l <= r){
            int mid = l + (r - l) / 2;
            if (data[mid].compareTo(target) == 0){
                return mid;
            }
            if (data[mid].compareTo(target) < 0){
                l = mid + 1;
            }else {
                r = mid - 1;
            }
        }
        return  -1;
    }


    public static <E extends Comparable<E>> int searchR(E[] data,E target){

        return searchR(data, 0,data.length - 1, target);
    }

    private static <E extends Comparable<E>> int searchR(E[] data,int l, int r, E target){
        if(l > r) {
            return -1;
        }

        int mid = l + (r - l) / 2;
        if (data[mid].compareTo(target) == 0){
            return mid;
        }

        if (data[mid].compareTo(target) < 0 ){
            return searchR(data, mid + 1, r, target);
        }else {
            return searchR(data, l, mid -1, target);
        }
    }

    /**
     * 从数组中找到 >target的最小值 索引
     * 入参为有序数组
     * @param data
     * @param target
     * @param <E>
     * @return
     */
    public static <E extends Comparable<E>> int upper(E[] data,E target){
        int l = 0 , r = data.length;
        while (l < r){
            int mid = l + (r - l)/2;
            if (data[mid].compareTo(target) <= 0){
                l = mid +  1;
            }else if(data[mid].compareTo(target) > 0){
                r = mid;
            }
        }
        return l;
    }

    /**
     * 数组中存在重复元素
     * 如果数组中存在元素，返回最大索引
     * 如果数组中不存在元素，返回upper
     * @param data
     * @param target
     * @param <E>
     * @return
     */
    public static <E extends Comparable<E>> int ceil(E[] data,E target){
        int u =  upper(data,target);
        if (u - 1 >= 0 && data[u - 1].compareTo(target) == 0){
            return u - 1;
        }else {
            return u;
        }
    }

    /**
     * >= target的最小索引
     * @param data
     * @param target
     * @param <E>
     * @return
     */
    public static <E extends Comparable<E>> int lower_ceil(E[] data,E target){
        int l = 0 , r = data.length;
        while (l < r){
            int mid = l + (r - l)/2;
            if (data[mid].compareTo(target) < 0 ){
                l = mid + 1;
            }else {
                r = mid;
            }

        }
        return l;
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 1, 3, 3, 5, 5};
        for(int i = 0; i <= 6; i ++)
            System.out.print(BinarySearch.lower_ceil(arr, i) + " ");
        System.out.println();
    }
}
