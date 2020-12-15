package mkw.linearSearch;


/**
 * 线性查找算法  在一个数组中查找元素
 */
public class LinearSearch {

    private LinearSearch(){}

    public static void main(String[] args) {
        Integer[] intArr =  {55,22,14,56,23,123,63};
        System.out.println(LinearSearch.find(intArr,23));
    }

    /**
     * 入参一个数组和需要查找的元素
     * 返回目标所在的索引
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
