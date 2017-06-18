package cn.bupt.swordToOffer;


public class TreeNodeSumPath {
	
	public static void main(String[] args) {
		TreeNode root=new TreeNode(1);
		TreeNode node2=new TreeNode(2);
		TreeNode node3=new TreeNode(3);
		TreeNode node4=new TreeNode(4);
		TreeNode node5=new TreeNode(5);
		TreeNode node6=new TreeNode(6);
		TreeNode node7=new TreeNode(7);
		TreeNode node8=new TreeNode(8);
		TreeNode node9=new TreeNode(9);
		TreeNode node10=new TreeNode(10);
		root.left=node2;
		root.right=node3;
		node2.left=node4;
		node2.right=node5;
		node4.left=node8;
		node4.right=node9;
		node5.left=node10;
		node3.left=node6;
		node3.right=node7;
		TreeNodeSumPath treeNodeSumPath=new TreeNodeSumPath();
		System.out.println(treeNodeSumPath.getTreeNodeSumPath(root));
	}
	
	
	
	public int getTreeNodeSumPath(TreeNode root){
		if(root==null) return 0;
		return getSumPath(root,0);
		
	}
	
	public int getSumPath(TreeNode root,int current){
		if(root==null) return 0;
		current+=root.val;
		if(root.left==null&&root.right==null)
			return current;
		return getSumPath(root.left, current)+getSumPath(root.right, current);
		
	}

}
