package mkw.queue;

import mkw.array.Array;

/**
 * 数组队列
 * @param <E>
 */
public class ArrayQueue<E> implements Queue<E> {
    private Array<E> array;

    public ArrayQueue(){
        this.array = new Array<>();
    }

    public ArrayQueue(int capacity){
        array = new Array<>(capacity);
    }


    @Override
    public void enqueue(E e) {
        array.addLast(e);
    }

    @Override
    public E dequeue() {
        return array.removeFirst();
    }

    @Override
    public E getFront() {
        return array.getFrist();
    }

    @Override
    public int getSize() {
        return array.getSize();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append(String.format("Queue: "));
        res.append("front [");
        for (int i = 0; i < array.getSize(); i++){
            res.append(array.get(i));
            if (i != array.getSize() - 1){
                res.append(",");
            }
        }
        res.append("] tail");
        return res.toString();
    }

    public int getCapacity(){
        return array.getCapacity();
    }
}
