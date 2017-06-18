package cn.bupt.swordToOffer;

public class FindFirstCommonNode {
	
	public static void main(String[] args) {
		ListNode node1=new ListNode(1);
		ListNode node2=new ListNode(2);
		ListNode node3=new ListNode(3);
		ListNode node4=new ListNode(4);
		ListNode node5=new ListNode(5);
		ListNode node6=new ListNode(6);
		ListNode node7=new ListNode(7);
		ListNode node8=new ListNode(8);
		ListNode node9=new ListNode(9);
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		node4.next=node5;
		node5.next=node6;
		node6.next=node7;
		node7.next=node8;
		node8.next=node9;
		ListNode node11=new ListNode(11);
		ListNode node21=new ListNode(21);
		ListNode node31=new ListNode(31);
		ListNode node41=new ListNode(41);
		ListNode node51=new ListNode(51);
		ListNode node61=new ListNode(61);
		ListNode node71=new ListNode(71);
		ListNode node81=new ListNode(81);
		ListNode node91=new ListNode(91);
		node11.next=node21;
		node21.next=node31;
		node31.next=node41;
		node41.next=node51;
		node51.next=node5;
		node5.next=node6;
		node6.next=node7;
		node7.next=node8;
		node8.next=node9;
		FindFirstCommonNode findFirstCommonNode=new FindFirstCommonNode();
		ListNode common=findFirstCommonNode.FindFirstCommonNode1(node1,node11);
		System.out.println(common.val);
		
	}
	//方法1
	public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
		int size1=listSize(pHead1);
		int size2=listSize(pHead2);
		ListNode current1=pHead1,current2=pHead2;
		if(size1>size2){
			current1=walkAfter(current1, size1-size2);
		}else if(size2>size1){
			current2=walkAfter(current2, size2-size1);
		}
		
		while(current1!=null&&current2!=null&&current1!=current2){
			current1=current1.next;
			current2=current2.next;
		}
		return current1;
		
    }
	
	public ListNode walkAfter(ListNode listNode,int step){
		ListNode curr=listNode;
		while(curr!=null&&step>0){
			curr=curr.next;
			--step;
		}
		return curr;
	}
	
	public int listSize(ListNode listNode){
		ListNode curr=listNode;
		int size=0;
		while(curr!=null){
			++size;
			curr=curr.next;
		}
		return size;
	}
	//方法二
	 public ListNode FindFirstCommonNode1(ListNode pHead1, ListNode pHead2) {
		 ListNode current1=pHead1,current2=pHead2;
		 while(current1!=current2){
			 current1=(current1==null?pHead2:current1.next);
			 current2=(current2==null?pHead1:current2.next);
		 }
		 return current1;
	 }
	
}
