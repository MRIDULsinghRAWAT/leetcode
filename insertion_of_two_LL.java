/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

// using 2 pointer  

// 2 pointer bna dete hai phel to 
ListNode a= headA;    // length of a
ListNode b = headB;    // length of  b 

// traverse 
while(a!=b){

    if(a!=null){
        a=a.next; // khali nahi hai to aage shift 
    }else{
        a=headB;  
// khali hai to "a" ko headB dedo - beech mei ajayega fir 
    }


    if(b!=null){
        b=b.next;
    }else{
        b=headA; // B wali list end hui to A ki list se  shuru krrdo insertion 
    }
}
return a;  // insert krrne wala element return krrdo 


    }
}