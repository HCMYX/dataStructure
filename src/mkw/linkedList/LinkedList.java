package mkw.linkedList;

public class LinkedList<E> {

    private Node dummyHead;
    private int size;

    public LinkedList(){
        dummyHead= new Node(null,null);
        size = 0;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    //在链表头添加元素E
    public void addFirst(E e){
        add(0,e);
    }

    //在链表中间添加元素
    public void add(int index,E e){
        Node prev = dummyHead;
        for (int i = 0; i < index; i++){
            prev = prev.next;
        }
        prev.next = new Node(e,prev.next);
        size ++;
    }

    public void addList(E e){
        add(size,e);
    }

    public E get(int index){
        Node cur = dummyHead.next;
        for (int i = 0; i < index; i ++){
            cur = cur.next;
        }
        return (E) cur.e;
    }

    public E getFirst(){
        return get(0);
    }

    public E getLast(){
        return get(size - 1);
    }

    public void set(int index,E e){
        Node cur = dummyHead.next;
        for (int i = 0; i < index ; i ++){
            cur = cur.next;
        }
        cur.e = e;
    }

    //查找是否存在元素
    public boolean contains(E e){
        Node cur = dummyHead.next;
        while (cur != null){
            if (cur.e.equals(e)){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    public E delete(int index ){
        Node prev = dummyHead;
        for (int i = 0; i < index; i++){
            prev = prev.next;
        }
        Node retNode = prev.next;
        prev.next = retNode.next;
        retNode.next = null;
        size --;
        return (E) retNode.e;
    }

    public E removeFirst(){
        return delete(0);
    }

    public E removeLast(){
        return delete(size - 1 );
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        Node cur = dummyHead.next;
        while (cur != null){
            res.append(cur + "->");
            cur = cur.next;
        }
        res.append("NULL");
        return res.toString();
    }

    private class Node<E>{
        public E e;
        public Node next;

        public Node(E e, Node next) {
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
