package cn.bupt.swordToOffer;

public class HasSubtree {
	public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        boolean success=false;
        if(root1!=null&&root2!=null){
        	if(root1.val==root2.val)
        		success= Tree1HasTree2(root1, root2);
        	if(!success)
        		success= HasSubtree(root1.left, root2);
        	if(!success)
        		success= HasSubtree(root1.right, root2);
        }
		
		return success;
    }
	
	public boolean Tree1HasTree2(TreeNode root1,TreeNode root2){
		if(root1==null&&root2!=null)
			return false;
		if(root2==null)
			return true;
		if(root1.val!=root2.val)
			return false;
		return Tree1HasTree2(root1.left, root2.left)&&Tree1HasTree2(root1.right, root2.right);
		
	}

}
