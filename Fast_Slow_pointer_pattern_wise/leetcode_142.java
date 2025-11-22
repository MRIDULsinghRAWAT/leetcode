public class leetcode_142 {
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
// checking of exact node where the cycle begins 
/**Use slow and fast pointers to check if a cycle exists (fast moves 2 steps, slow 1 step).

When they meet, it confirms a cycle is present.

Now start one pointer from head and one from the meeting point.

The point where both meet again is the start of the cycle. */
