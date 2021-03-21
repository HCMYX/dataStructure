package mkw.linkedList.test;

/**
 * 通过递归形式删除 链表里面的指定元素
 */
public class Solution1 {

    public ListNode removeElements(ListNode head,int val){
        if (head == null){
            return null;
        }
        ListNode res = removeElements(head.next,val);
        if (head.val == val){
            return res;
        }else {
            head.next = res;
            return head;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,6,3,4,5,6};
        ListNode head = new ListNode(nums);
        System.out.println(head);

        ListNode res = (new Solution1()).removeElements(head,6);
        System.out.println(res);
    }
}
