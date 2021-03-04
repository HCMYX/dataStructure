package mkw.queue;

/**
 * 双端队列
 */
public class Deque<E> {
    private E[] data;
    //队首的索引
    private int front;
    //队列的下个位置的索引
    private int tail;
    private int size;

    public int getSize() {
        return size;
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

    public Deque(int capacity){
        data = (E[]) new Object[capacity + 1];
        front = 0;
        tail = 0;
        size = 0;
    }

    public Deque(){
        this(10);
    }

    public int getCapacity(){
        return data.length - 1;
    }


    public void addFront(E e){
        if ((tail + 1) % data.length == front){
            resize(getCapacity() * 2);
        }
        data[(front-1+getCapacity()) % data.length] = e;
        size ++;
    }

    public void addLast(E e){
        if ((tail + 1) % data.length == front){
            resize(getCapacity() * 2 );
        }
        data[tail] = e;
        tail = (tail+1) % data.length;
        size ++;
    }

    public E removeFront(){
        if (isEmpty()){
            throw new IllegalArgumentException("Cannot dequeue from an empty queue");
        }
        E ret = data[front];
        data[front] = null;
        front = (front + 1) % data.length;
        if (size == getCapacity() / 4 && getCapacity() / 2 != 0 ){
            resize(getCapacity()/2);
        }
        return ret;
    }

    public E removeLast(){
        if (isEmpty()){
            throw new IllegalArgumentException("Cannot dequeue from an empty queue");
        }
        tail = (tail + getCapacity() - 1) % data.length;
        E ret = data[tail];
        data[tail] = null;
        size --;
        if (size == getCapacity() / 4 && getCapacity() / 2 != 0 ){
            resize(getCapacity()/2);
        }
        return ret ;
    }

    public boolean isEmpty(){
        return front == tail;
    }

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
}
