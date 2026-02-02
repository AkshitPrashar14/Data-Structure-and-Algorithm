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
        List<Integer> abc=new ArrayList<>();
        for(int i=0;i<lists.length;i++){
            ListNode temp=lists[i];
            while(temp!=null){
                abc.add(temp.val);
                temp=temp.next;
            }
        }
        Collections.sort(abc);
        ListNode head=null;
        for(int x:abc){
            head=insertAtTail(head,x);
        }
        return head;
    }
    ListNode insertAtTail(ListNode head,int value){
        ListNode newNode=new ListNode(value);
        if(head==null){
            head=newNode;
            return head;
        }
        ListNode temp=head;
        while(temp!=null && temp.next!=null){
            temp=temp.next;
        }
        temp.next = newNode;
        return head;
    }
}
