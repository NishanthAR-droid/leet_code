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
    public ListNode middleNode(ListNode head) {
        
        ListNode end=head;
        ListNode middle=head;
        while(end!=null && end.next!=null)
        {
            middle=middle.next;
            end=end.next.next;
        }
        return middle;
        
//        Array `solution 
       //  ArrayList<ListNode> vals=new ArrayList<>(); 
       //  int length=0;
       //  while(head!=null)
       //  {
       //      vals.add(head);
       //      length++;
       //      head=head.next;
       //  }
       // return vals.get(length/2);               
    }
}