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
    static int l;
    static ListNode dummyHead;
    public ListNode removeNthFromEnd(ListNode head, int n) {
        l=0;
        dummyHead=head;
        traverse(head,null,n);
        return dummyHead;
    }


    static void traverse(ListNode node,ListNode prev,int n){

        if(node==null){
            return;
        }

        traverse(node.next,node,n);
        l++;
        if(l==n){
            if(prev==null){
                dummyHead=node.next;
                return;
            }
            prev.next=node.next;
        }
    }
}