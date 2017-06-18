package cn.bupt.swordToOffer;

public class MergeSortedList {
	class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
	
	/*public ListNode Merge(ListNode list1,ListNode list2) {
		if(list1==null&&list2==null){
			return null;
		}else if(list1==null){
			return list2;
		}else if(list2==null){
			return list1;
		}
		
        ListNode mergeRoot=null;
        ListNode currentList1=null;
    	ListNode currentList2=null;
        if(list1.val<=list2.val){
        	mergeRoot=list1;

        	currentList1=list1.next;
        	currentList2=list2;
        }else{
        	mergeRoot=list2;
        	currentList2=list2.next;
        	currentList1=list1;
        }
        ListNode current=mergeRoot;
    
        	
    	while(currentList1!=null&&currentList2!=null){
    		if(currentList1.val<=currentList2.val){
    			current.next=currentList1;
    			currentList1=currentList1.next;
    		}else{
    			current.next=currentList2;
    			currentList2=currentList2.next;
    		}
    		current=current.next;
    	}
    	
    	while(currentList2!=null){
    		current.next=currentList2;
			currentList2=currentList2.next;
			current=current.next;
    	}
        return mergeRoot;
    }*/
	


	public ListNode Merge(ListNode list1,ListNode list2){
		if(list1==null){
			return list2;
		}
		if(list2==null){
			return list1;
		}
		
		if(list1.val<=list2.val){
			list1.next=Merge(list1.next, list2);
			return list1;
		}else{
			list2.next=Merge(list1, list2.next);
			return list2;
		}
	}

}
