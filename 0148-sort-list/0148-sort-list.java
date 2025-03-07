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
    public ListNode sortList(ListNode head) {
    List<Integer> list=new ArrayList<>();
    while(head != null){
        list.add(head.val);
        head=head.next;
    }
    int arr[]=new int[list.size()];
    for(int i=0;i<list.size();i++){
        arr[i]=list.get(i);
    }
     Arrays.sort(arr);  
     ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        
        for (int num : arr) {
            temp.next = new ListNode(num);
            temp = temp.next;
        }
        
        return dummy.next;
    }
}