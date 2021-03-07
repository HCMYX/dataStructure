package mkw.linkedList;

import mkw.queue.Queue;

/**
 * 链表实现队列
 */
public class LinkedListQueue<E> implements Queue<E> {

    private Node head,tail;
    private int size;

    public LinkedListQueue(){
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public void enqueue(E e) {
        if (tail == null){
            tail = new Node(e);
            head = tail;
        }else {
            tail.next = new Node(e);
            tail = tail.next;
        }
        size ++;
    }

    @Override
    public E dequeue() {
        Node retNode = head;
        head = head.next;
        retNode.next = null;
        if (head == null){
            tail = null;
        }
        size --;
        return (E) retNode.e;
    }

    @Override
    public E getFront() {
        return (E) head.e;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        LinkedListQueue.Node cur = head;
        while (cur != null){
            res.append(cur + "->");
            cur = cur.next;
        }
        res.append("NULL");
        return res.toString();
    }

    private class Node<E>{
        public E e;
        public LinkedListQueue.Node next;

        public Node(E e, LinkedListQueue.Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(E e) {
            this.e = e;
        }

        public Node() {
            this(null,null);
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }
}
