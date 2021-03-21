package mkw.linkedList.test;

public class ListNode {
    int val;
    ListNode next;
    public ListNode(int x){
        val = x;
    }

    //通过数组创建链表
    public ListNode(int[] arr){
        this.val = arr[0];
        ListNode cur = this;
        for (int i = 1; i < arr.length; i++){
            cur.next = new ListNode(arr[i]);
            cur = cur.next;
        }
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        ListNode cur = this;
        while (cur != null){
            res.append(cur.val + "->");
            cur = cur.next;
        }
        return res.append("null").toString();
    }
}
