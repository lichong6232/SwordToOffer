package cn.bupt.swordToOffer;

import cn.bupt.swordToOffer.LastKListNode.ListNode;





public class ChainTable {
	
	private int size;
	private Node head;
	
	public ChainTable() {
		// TODO Auto-generated constructor stub
		head=new Node();
		size=0;
	}
	
	class Node {
		
		private Object data;
		private Node next;
		

	}
	


	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size==0;
	}


	public int size() {
		// TODO Auto-generated method stub
		return size;
	}


	public Object get(int index) {
		// TODO Auto-generated method stub
		if(index>=size){
			try {
				throw new Exception("index应小于size");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}else{
			Node p=head.next;
			int i=0;
			while(i<index){
				p=p.next;
				i++;
			}
			return p.data;
		}
		
		
	}


	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		Node p=head;
		int i=0;
		while(p.next!=null){
			p=p.next;
			if(p.data.equals(o)){
				return i;
			}
			i++;
		}

	
		
		return -1;
	}


	public Object remove(int index) {
		// TODO Auto-generated method stub
		Node p=head;
		int i=0;
		if(index>size-1){
			try {
				throw new Exception("index超过表的大小");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return null;
		}else{
			while(i<index){
				p=p.next;
				i++;
			}
			Node node=p.next;
			p.next=p.next.next;
			size--;
			return node.data;
		}
		
		
		
		
	}


	public void add(int index, Object o) {
		// TODO Auto-generated method stub
		
		if(index>size){
			try {
				throw new Exception("您插入的位置不正确，index应该�?到size之间");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			
			Node p=head;
			int i=0;
			while(i<index){
				p=p.next;
				i++;
			}
			Node node=new Node();
			node.data=o;
			node.next=p.next;
			p.next=node;
			size++;
			
		}
		
		
		
	}

	
	public void add(Object o) {
		// TODO Auto-generated method stub
		
		Node node=new Node();
		node.data=o;
		node.next=head.next;
		head.next=node;
		size++;
	}


	public void outPut() {
		// TODO Auto-generated method stub
		
		Node p=head;
		while(p.next!=null){
			p=p.next;
			System.out.println(p.data);
		}
		
	}
	
	
	public void reverse(){
		
		Node firstNode=head.next;
		if(firstNode!=null){
			Node node=firstNode.next;
			while(node!=null){
				firstNode.next=node.next;
				node.next=head.next;
				head.next=node;
				node=firstNode.next;
			}
		}
	}
	
	public void reverse1(){
		Node pre=null;
		Node node=head.next;
		while(node!=null){
			Node temp=node.next;
			node.next=pre;
			pre=node;
			node=temp;
			System.out.println(pre.data);
		}
		
		head.next=pre;
	}
	
	public void reverse2(){
		head.next=ReverseList(head.next);
	}
	
	private Node ReverseList(Node head) {
		 if(head==null||head.next==null){
			 return head;
		 }
		 Node next=ReverseList(head.next);
		 head.next.next=head;
		 head.next=null;
		 return next;

	 }
	
	public Node Merge(ChainTable chainTable) {
		Node list1=head.next,list2=chainTable.head.next;
		Node mergeRoot=null;
		Node currentList1=null;
		Node currentList2=null;
        if((int)list1.data<=(int)list2.data){
        	mergeRoot=list1;
        	currentList1=list1.next;
        	currentList2=list2;
        }else{
        	mergeRoot=list2;
        	currentList2=list2.next;
        	currentList1=list1;
        }
        Node current=mergeRoot;
    
        	
    	while(currentList1!=null&&currentList2!=null){
    		if((int)currentList1.data<=(int)currentList2.data){
    			current.next=currentList1;
    			currentList1=currentList1.next;
    		}else{
    			current.next=currentList2;
    			currentList2=currentList2.next;
    		}
    		current=current.next;
    	}
    	
    	while(currentList1!=null){
    		current.next=currentList1;
			currentList1=currentList1.next;
			current=current.next;
    	}
    	while(currentList2!=null){
    		current.next=currentList2;
			currentList2=currentList2.next;
			current=current.next;
    	}
    	System.out.println(currentList1);
    	System.out.println(currentList2);
        return head.next=mergeRoot;
    }
	
	
	public ListNode FindKthToTail(ListNode head,int k) {
		 int last[]=new int[1];
		 return FindKthListNode(head,k,last);

	 }
	 
	 private ListNode FindKthListNode(ListNode head,int k,int last[]){
		if(head!=null){
			 if(last[0]==k){
				 return head;
			 }else{
				 FindKthListNode(head.next, k, last);
				 ++last[0];
				 return null;
			 }
		 }
		return null;
	 }

}
