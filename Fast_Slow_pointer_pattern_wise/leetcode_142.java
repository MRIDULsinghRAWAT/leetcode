public class leetcode_142 {
    // simple ListNode definition compatible with LeetCode problems
    public static class ListNode {
        int val;
        ListNode next;
        public ListNode(int x) { val = x; next = null; }
    }


    public ListNode detectCycle(ListNode head){
    ListNode slow = head;
ListNode fast =head;
while(fast!=null && fast.next!= null)
{
slow =slow.next;  
fast=fast.next.next; 

if(slow==fast){
    ListNode p1=head;
    ListNode p2=head;

    while(p1!=p2){
        p1=p1.next;
        p2=p2.next;

    }
    return p1;

}
}
return null;

    }

}
