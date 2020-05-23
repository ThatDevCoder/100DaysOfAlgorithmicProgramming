// Code:
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(ListNode head: lists){
            while(head!=null){
                minHeap.add(head.val);
                head = head.next;
            }
        }
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while(!minHeap.isEmpty()){
            tail.next =new ListNode(minHeap.poll());
            tail = tail.next;
        }
        return dummy.next;
    }
}
