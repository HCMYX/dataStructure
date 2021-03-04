package mkw.array;

import java.util.Objects;

public class Array<E> {
    private E[] data;
    private int size;

    //构造函数，传入数组容量capacity构造Array
    public Array(int capacity){
        data = (E[])new Object[capacity];
        size = 0;
    }

    //无参构造函数，默认数组容量capacity=10
    public Array(){
        this(10);
    }

    //获取数组中元素个数
    public int getSize() {
        return size;
    }

    //获取数组容量
    public int getCapacity(){
        return data.length;
    }

    //返回数组是否为空
    public boolean isEmpty(){
        return size == 0 ;
    }

    //向所有元素最后添加一个元素
    public void addLast(E e){
        add(size,e);
    }

    //在所有元素前插入一个新元素
    public void addFirst(E e){
        add(0,e);
    }

    //向指定位置添加元素
    public void add(int index,E e){
        if (size == data.length){
            throw new IllegalArgumentException("Addlast failed. Array is full");
        }
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Addlast failed. Require index >= 0 and index <= size");
        }
        for (int i = size-1; i>=index; i++){
            this.data[i+1] = this.data[i];
        }
        data[index] = e;
        size++;
    }

    //查找数组中是否存在元素e
    public boolean contains(E e){
        for (int i = 0 ;i < size; i++){
            if (data[i] == e){
                return true;
            }
        }
        return false;
    }

    //从数组中删除index位置的元素 返回删除的元素
    public E remove(int index){
        if (index<0 || index >= size){
            throw new IllegalArgumentException("Remove failed. Index is illegal");
        }
        E ret = data[index];
        for (int i = index + 1; i<size; i++){
            data[i-1] = data[i];
            size--;
        }
        return ret;
    }

    public E removeFirst(){
        return remove(0);
    }

    public E removeLast(){
        return remove(size-1);
    }

    //获取索引为index索引的元素
    public E get(int index){
        if (index < 0 || index >=size){
            throw new IllegalArgumentException("Get failed. Index is illegal");
        }
        return data[index];
    }

    public E getLast(){
        return get(size - 1);
    }

    public E getFrist(){
        return get(0);
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append(String.format("Array: size = %d , capacity = %d\n",size,data.length));
        res.append("[");
        for (int i = 0; i < size; i++){
            res.append(data[i]);
            if (i != size - 1){
                res.append(",");
            }
        }
        res.append("]");
        return res.toString();
    }
}
