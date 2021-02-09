package mkw.linearSearch;


/**
 * 线性查找算法  在一个数组中查找元素
 */
public class LinearSearch {

    private LinearSearch(){}

    public static void main(String[] args) {

        Student[] stArr = {new Student("zhangsan"),
                new Student("lisi"),
                new Student("wanger")};

        System.out.println(LinearSearch.find(stArr,new Student("lisi")));
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
