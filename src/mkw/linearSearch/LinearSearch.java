package mkw.linearSearch;


/**
 * 线性查找算法  在一个数组中查找元素
 */
public class LinearSearch {

    private LinearSearch(){}

    public static void main(String[] args) {
        int n = 10000000;
        Integer[] arr =  ArrayGenerator.generateOrderedArray(n);
        long startTime = System.nanoTime();
        LinearSearch.find(arr,10000000);
        long endTime = System.nanoTime();
        double time = (endTime - startTime) / 1000000000.0;
        System.out.println(time);
    }

    /**
     * 入参一个数组和需要查找的元素
     * 返回目标所在的索引
     * 自定义数组的类型，需要自己实现比对芳芳
     * @param intArr
     * @param num
     * @return
     */
    public static <E> int find(E[] intArr,E num){
        for (int i=0 ; i<intArr.length ; i++){
            if (intArr[i].equals(num)){
                return i;
            }
        }
        return -1;
    }

}
