package cn.bupt.swordToOffer;


public class BuildTreeDependsPreAndMin {
	class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
	 }
	public TreeNode reConstructBinaryTree(int [] pre,int [] in) {

	        return reConstructTree(pre,0,pre.length-1,in,0,in.length-1);
	}
	
	public TreeNode reConstructTree(int pre[],int preLeft,int preRight,int in[],int inLeft,int inRight){
		if(preLeft>preRight||inLeft>inRight){
			return null;
		}
		
		TreeNode treeNode=new TreeNode(pre[preLeft]);
		int i=inLeft;
		
		for(;i<=inRight;i++){
			if(pre[preLeft]==in[i]){
			
				break;
			}
		}
		treeNode.left=reConstructTree(pre, preLeft+1, preLeft+i-inLeft, in, inLeft, i-1);
		treeNode.right=reConstructTree(pre, preLeft+i-inLeft+1, preRight, in, i+1, inRight);
		return treeNode;
		
	}

}
