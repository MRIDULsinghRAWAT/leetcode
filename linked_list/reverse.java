  public class reverse {
      int val;
      reverse next;
      reverse() {}
      reverse(int val) { this.val = val; }
      reverse(int val, reverse next) { this.val = val; this.next = next; }
  }
class Solution {
    public reverse reverseList(reverse head) {
        reverse prev = null;
        reverse current = head;
        while (current != null) {
            reverse temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        return prev;
    }
}
