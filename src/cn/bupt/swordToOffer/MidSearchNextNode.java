package cn.bupt.swordToOffer;


class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}
public class MidSearchNextNode {
	
	
	public TreeLinkNode GetNext(TreeLinkNode pNode){
		if(pNode==null)
			return null;
		
		if(pNode.right!=null){
			TreeLinkNode curr=pNode.right;
			while(curr.left!=null){
				curr=curr.left;
			}
	        return curr;
		}
		
		while(pNode.next!=null)
        {
            if(pNode.next.left==pNode)
            	return pNode.next;
            pNode=pNode.next;
        }
		return null;
		
    }

}
