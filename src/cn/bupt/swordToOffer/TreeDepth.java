package cn.bupt.swordToOffer;

public class TreeDepth {
	
	public static void main(String[] args) {
		TreeDepth treeDepth=new TreeDepth();
		TreeNode rootNode=new TreeNode(0);
		TreeNode node1=new TreeNode(1);
		TreeNode node2=new TreeNode(2);
		TreeNode node3=new TreeNode(3);
		TreeNode node4=new TreeNode(4);
		rootNode.left=node1;
		node1.left=node2;
		node2.left=node3;
		node1.right=node4;
		System.out.println(treeDepth.TreeDepth(rootNode));
		
	}
	
	public int TreeDepth(TreeNode root) {
		if(root!=null)
			return Math.max(TreeDepth(root.left), TreeDepth(root.right))+1;
		return 0;
    }

}
