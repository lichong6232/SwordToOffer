package cn.bupt.swordToOffer;

public class ReverseList {
	class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
	
	/* public ListNode ReverseList(ListNode head) {
		 ListNode pre=null;
		 ListNode node=head;
		 while(node!=null){
			 ListNode temp=node.next;
			 node.next=pre;
			 pre=node;
			 node=temp;
		 }
		 
		 return pre;

	 }*/
	
	public ListNode ReverseList(ListNode head) {
		 if(head==null||head.next==null){
			 return head;
		 }
		 ListNode next=ReverseList(head.next);
		 head.next.next=head;
		 head.next=null;
		 return next;

	 }

}
