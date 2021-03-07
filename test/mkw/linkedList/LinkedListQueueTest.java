package mkw.linkedList;

import com.dataStructure.tree.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListQueueTest {
    @Test
    public void test01(){
        Node n1 = new Node();
        Node n2 = new Node();
        Node n = new Node();
        n.setData("123");
        n1.setLeft(n);
        n2.setLeft(n1);
        n1.getLeft().setData("2321");
        n1.setLeft(null);
        n2.setLeft(n);
    }
}