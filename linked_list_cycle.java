/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
     //  cycle hogi to True warna False   

// LETS LEARN 

// HAVE & TORTOISE ALGORITHM 
// 2 POINTER 
// SLOW - STEP 1
// FAST -STEP 2

/** 
IF (slow ==fast )  ///////////////////////
 cycle in the list 

 else 
 not a cycle in the list 

 slow - 1step 
 fast - 2 step 
 */

 
ListNode slow = head;
ListNode fast =head;
while(fast!=null && fast.next!= null)
{
fast=fast.next.next;  // 2 step
slow =slow.next;     // 1 step
 if (slow ==fast ){
    return true;
 }
}
return false; 
    }
}

