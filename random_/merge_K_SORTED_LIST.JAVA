/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
    // PAIR MEI MERGE HOGA FIR MAINE KYA KIA J0O MERGE 2 SORTED LITS HAI USKA LOGIC CHIPKAAAA DIA AUR HOAGYA     
// merge krrne ke tareeke
// phele merge then sort ----- NAHIIII


if(lists ==null || lists.length==0){
    return null;
}
int n=lists.length;   // total no. of nodes 
while(n>1)    {
int k=0;    // zaroori h
// naye merge list sort krrne ke liye
// number of lists

//merging of list in pairs 
for(int i=0;i<n;i=i+2) {// 2 chodke 
ListNode l1 =lists[i];  // pheli list li
ListNode l2 =(i+1 <n) ? lists[i+1]:null ; // dusri li , if exist
lists[k++] =mergeTwoLists(l1,l2);    // yhaan merge wala call hoga hamesha  private uska bna ahai saale

}
n=k;
// Update n = k
// Ek round ke baad n = ab kitni lists bachi hain (merged wali).
// Example: Agar n=6 tha → 3 merged lists bachi.
// Next round me n = 3.

// JAB TAK N=1 NAHI NHUA TAB TAK PROCESS REPEAT 
}
return lists[0];
    }
 private ListNode mergeTwoLists(ListNode head1, ListNode head2) {
   // recurssion use krrte h 
   // ismei hum choti problems ko lete h 
   // phele head jo solve krrte h fir aage badhte h 


if (head1 == null ||head2 == null ){
return head1 == null ? head2 : head1; //condition ? if_true : if_false;
}
// case 1 
   if (head1.val <= head2.val){   //h1<=h2
   /**
   Agar head1 ke node ka value chhota ya barabar hai head2 ke node ke value se, tab condition true hogi.

Example:
head1.val = 2, head2.val = 5 → 2 <= 5 → true */
head1.next = mergeTwoLists(head1.next,head2);
return head1;
   }else{
    //case2 
head2.next = mergeTwoLists(head1,head2.next);
return head2;

   }

    }

}











    
