package cn.bupt.swordToOffer;



public class LastKListNode {
	class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
	
	public static void main(String[] args) {
		LastKListNode lastKListNode=new LastKListNode();
		int a[]={1,2,3,4,5,6};
		ListNode head=lastKListNode.buildList(a);
		ListNode thKListNode=lastKListNode.FindKthToTail1(head, 2);
		System.out.println(thKListNode.val);
//		lastKListNode.outPut(head);
		
	}
	public void outPut(ListNode head){
		ListNode current=head;
		while(current!=null){
			System.out.println(current.val);
			current=current.next;
		}
	}
	
	public  ListNode buildList(int array[]){
		ListNode root=null;
		
		if(array.length>0){
			root=new ListNode(array[0]);
		}
		ListNode current=root;
		for(int i=1;i<array.length;i++){
			ListNode listNode=new ListNode(array[i]);
			current.next=listNode;
			current=current.next;
		}
		return root;
	}
	
	 public ListNode FindKthToTail(ListNode head,int k) {
		 int last[]=new int[1];
		 return FindKthListNode(head,k,last);

	 }
	 
	 private ListNode FindKthListNode(ListNode head,int k,int last[]){
		
		if(head!=null){
			ListNode kThNode= FindKthListNode(head.next, k, last);
			 ++last[0];
			 if(last[0]==k){
				return head;
			 } 
			 return kThNode;
			
		 }
		
		return null;
	 }
	 
	 public ListNode FindKthToTail1(ListNode head,int k) {
		ListNode p=head,q=head;
		int i=0;
		while(p!=null){
			if(i>=k){
				q=q.next;
			}
			p=p.next;
			i++;
		}
		return i<k?null:q;

	 }
	 
	

}
