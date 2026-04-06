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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ArrayList<ListNode> list =new ArrayList<>();

        ListNode curr=head;
        while(curr!=null){
            list.add(curr);
            curr=curr.next;
        }

        int size=list.size();
        
            if (size == n) {
            return head.next;
        }

        
        ListNode l1=list.get(size-n);
        ListNode l2=list.get(size-n-1);
        l2.next=l1.next;

        list.remove(size-n);

        size=size-1;
        head=list.get(0);
        curr=head;
    for(int i=1;i<size;i++){
        curr.next=list.get(i);
        curr=curr.next;
    }
        return head;
    }
}
