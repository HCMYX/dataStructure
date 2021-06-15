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

    /**
     * 寻找<target的最大值
     *
     */
    public static <E extends Comparable<E>> int lower(E[] data,E target){
        int l = -1,r = data.length - 1;
        //在data[l,r中寻找解]
        while (l < r){
            // 当 r = l + 1 的时候这种写法会出现死循环，因为除以2是向下取整
            // int mid = l + (r - l) / 2;
            int mid = l + (r - l + 1)/2;
            if (data[mid].compareTo(target) < 0){
                l = mid;
            }else {
                r = mid - 1;
            }
        }
        return l;
    }

    /**
     * 如果数组中存在元素，返回最小索引
     * 如果不存在元素，返回小于索引的最大值
     * @param data
     * @param target
     * @param <E>
     * @return
     */
    public static <E extends Comparable<E>> int lower_floor(E[] data,E target) {
        //本质就是小于target的最大索引 右边的一个数。
        int l = lower(data,target);
        if (l + 1 < data.length && data[l + 1 ].compareTo(target) == 0){
            l ++ ;
        }
        return l;
    }

    /**
     *  如果数组中存在元素，返回最大索引
     *  如果不存在元素，返回最大索引
     *  < = target的最大索引
     * @param data
     * @param target
     * @param <E>
     * @return
     */
    public static <E extends Comparable<E>> int upper_floor(E[] data,E target) {
        int l = -1, r = data.length - 1;
        while (l < r) {
            int mid = l + (r - l + 1)/2;
            if (data[mid].compareTo(target) > 0){
                r = mid - 1;
            }else {
                l = mid;
            }
        }
        return l; 
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 1, 3, 3, 5, 5,7,7};
        for(int i = 0; i <= 8; i ++)
            System.out.print(BinarySearch.lower_floor(arr, i) + " ");
        System.out.println();
    }
}
