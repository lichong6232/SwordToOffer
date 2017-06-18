package cn.bupt.swordToOffer;

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
}


public class ReverseKGroup {
	
	public static void main(String[] args) {
		ListNode head=new ListNode(1);
		ListNode currentFatherNode=head;
		for(int i=2;i<=5;i++){
			ListNode node=new ListNode(i);
			currentFatherNode.next=node;
			currentFatherNode=node;
		}
		ReverseKGroup reverseKGroup=new ReverseKGroup();
		ListNode top=reverseKGroup.reverseKGroup(head, 3);
		reverseKGroup.outList(top);
		
		
	}
	
	public void outList(ListNode head){
		ListNode node=head;
		while(node!=null){
			System.out.println(node.val);
			node=node.next;
		}
	}
	
	
	
	public ListNode reverseKGroup(ListNode head, int k) {
		int count=0;
		ListNode node=head;
		while(node!=null&&count!=k){
			++count;
			node=node.next;
		}
		
		if(count==k){
			ListNode toNode=reverseKGroup(node, k);
			ListNode fromNode=head;
			while(count-->0){
				ListNode nextNode=fromNode.next;
				fromNode.next=toNode;
				toNode=fromNode;
				fromNode=nextNode;
			}
			head=toNode;
		}
		
		return head;
	}

}
