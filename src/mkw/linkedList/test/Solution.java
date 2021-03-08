package mkw.linkedList.test;

public class Solution {

    public static ListNode removeElements(ListNode head,int val){
        ListNode node = head;
        while (node != null){
            if (node.val == val){
                //开始删除
                ListNode delNode = node;
                node = node.next;
                delNode.next = null;
            }else {
                node = node.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(5);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(2);
        ListNode node6 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node1 = Solution.removeElements(node1,5);
        System.out.println(node1);
    }
}
