package cn.bupt.swordToOffer;

import java.util.ArrayList;
import java.util.List;



public class PrintLinkValueFromHead2End {
	class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
	
	 public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		 ArrayList<Integer> list=new ArrayList<Integer>();
		 printList(listNode,list);
		 
		 return list;
		 
	        
	 }
	 
	 public void printList(ListNode listNode,List<Integer> list){
		 
		 if(listNode!=null){
			 printList(listNode.next, list);
			 list.add(listNode.val);
		 }
		 
	 }

}
