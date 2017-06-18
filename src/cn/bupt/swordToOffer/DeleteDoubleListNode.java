package cn.bupt.swordToOffer;

public class DeleteDoubleListNode { 
	
	public static void main(String[] args) {
		ListNode node1=new ListNode(1);
		ListNode node2=new ListNode(2);
		ListNode node3=new ListNode(3);
		ListNode node4=new ListNode(3);
		ListNode node5=new ListNode(4);
		ListNode node6=new ListNode(4);
		ListNode node7=new ListNode(5);
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		node4.next=node5;
		node5.next=node6;
		node6.next=node7;
		DeleteDoubleListNode deleteDoubleListNode=new DeleteDoubleListNode();
		ListNode node=deleteDoubleListNode.deleteDuplication(node1);
		deleteDoubleListNode.out(node);
		
	}
	
	public void out(ListNode node){
		while(node!=null){
			System.out.println(node.val);
			node=node.next;
		}
	}
	
	 public ListNode deleteDuplication(ListNode pHead){
		 if(pHead==null){
			 return null;
		 }
		 if(pHead!=null&&pHead.next==null){
			 return pHead;
		 }
		 
		 if(pHead.val==pHead.next.val){
			 ListNode curr=pHead.next.next;
			 while(curr!=null&&curr.val==pHead.val){
				 curr=curr.next;
			 }
			 return deleteDuplication(curr);
		 }else{
			 pHead.next=deleteDuplication(pHead.next);
			 return pHead;
		 }

	 }

}
