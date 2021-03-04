package mkw.queue;

import com.dataStructure.sequentialList.template.DATA;

/**
 * 循环队列
 */
public class LoopQueue<E> implements Queue<E> {

    private E[] data;
    //队首的索引
    private int front;
    //队列的下个位置的索引
    private int tail;
    private int size;

    public LoopQueue(int capacity){
        data = (E[]) new Object[capacity + 1];
        front = 0;
        tail = 0;
        size = 0;
    }

    public LoopQueue(){
        this(10);
    }

    public int getCapacity(){
        return data.length - 1;
    }

    @Override
    public boolean isEmpty(){
        return front == tail;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void enqueue(E e){
        if ((tail + 1) % data.length == front){
            resize(getCapacity() * 2 );
        }
        data[tail] = e;
        tail = (tail+1) % data.length;
        size ++;
    }

    @Override
    public E dequeue() {
        if (isEmpty()){
            throw new IllegalArgumentException("Cannot dequeue from an empty queue");
        }
        E ret = data[front];
        data[front] = null;
        front = (front + 1) % data.length;
        size --;
        if (size == getCapacity() / 4 && getCapacity() / 2 != 0 ){
            resize(getCapacity()/2);
        }
        return ret;
    }

    @Override
    public E getFront(){
        if (isEmpty()){
            throw new IllegalArgumentException("Cannot getFront from an empty queue");
        }
        return data[front];
    }

    private void resize(int newCapacity){
        E[] newData = (E[]) new Object[newCapacity + 1];
        for (int i = 0; i < size; i++){
            newData[i] = data[(i+front) % data.length];
        }
        data = newData;
        front = 0;
        tail = size;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("Queue  : size = %d , capacity = %d\n",size,data.length));
        res.append("[");
        for (int i = front; i != tail; i = (i+1)% data.length){
            res.append(data[i]);
            if ((i + 1) % data.length != tail){
                res.append(",");
            }
        }
        res.append("]");
        return res.toString();
    }
}
