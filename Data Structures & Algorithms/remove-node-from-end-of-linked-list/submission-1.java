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
        int N=0;

        ListNode curr=head;
        while(curr!=null){
            N++;
            curr=curr.next;
        }

        if(N==n){
            return head.next;
        }

        N=N-n;
        curr=head;
        int i=1;
        while(i<=N){
            curr=curr.next;
            i++;
        }
        ListNode prev=head;

        while(prev.next!=curr){
            prev=prev.next;
        }

        prev.next=curr.next;
        return head;
    }
}
