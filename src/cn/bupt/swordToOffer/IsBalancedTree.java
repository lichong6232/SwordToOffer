package cn.bupt.swordToOffer;

public class IsBalancedTree {
	
	 public boolean IsBalanced_Solution(TreeNode root) {
		 if(root!=null){
			 boolean leftBalanced=IsBalanced_Solution(root.left);
			 boolean rightBalanced=IsBalanced_Solution(root.right);
			 return Math.abs(TreeDepth(root.left)-TreeDepth(root.right))<2&&leftBalanced&&rightBalanced;
		 }
		 
	        
		 return true;
	 }
	 
	 public int TreeDepth(TreeNode root) {
			if(root!=null)
				return Math.max(TreeDepth(root.left), TreeDepth(root.right))+1;
			return 0;
	 }

}
