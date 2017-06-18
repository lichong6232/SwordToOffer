package cn.bupt.swordToOffer;

import javax.swing.text.AbstractDocument.LeafElement;


class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}

public class FindKMaxFrom2Tree {
	
	private TreeNode root;
	private int i=0;
	public static void main(String[] args) {
		FindKMaxFrom2Tree findKMaxFrom2Tree=new FindKMaxFrom2Tree();
		findKMaxFrom2Tree.buildTree(5);
		findKMaxFrom2Tree.buildTree(3);
		findKMaxFrom2Tree.buildTree(2);
		findKMaxFrom2Tree.buildTree(4);
		findKMaxFrom2Tree.buildTree(7);
		findKMaxFrom2Tree.buildTree(6);
		findKMaxFrom2Tree.buildTree(8);
		System.out.println(findKMaxFrom2Tree.KthNode(findKMaxFrom2Tree.root, 5).val);
		
		
	}
	
	public TreeNode middleVist(TreeNode node,int k){
		if(node!=null){
			middleVist(node.left,k);
			i++;
			if(i==k){
				return node;
			}
			middleVist(node.right,k);
		}
		return null;
	}
	
	public  void buildTree(int data){
		TreeNode node=new TreeNode(data);
		if(this.root==null){
			this.root=node;
		}else{
			TreeNode current=root;
			TreeNode parent=null;
			boolean isLeftChild=false;
			while(current!=null){
				parent=current;
				if(data<current.val){
					isLeftChild=true;
					current=current.left;
				}else{
					isLeftChild=false;
					current=current.right;
				}
			}
			if(isLeftChild){
				parent.left=node;
			}else{
				parent.right=node;
			}
		}
		
	}
	
	public  TreeNode KthNode(TreeNode pRoot, int k){
		if(pRoot!=null){
			if(k==1){
				return pRoot;
			}else{
				TreeNode leftKthNode=KthNode(pRoot.left, k-1);
				if(leftKthNode==null){
					return KthNode(pRoot.right, k-2);
				}else{
					return leftKthNode;
				}
			}
			
		}
		
		
		return null;
        
    }
	
	
	 public TreeNode inorderTraversal(TreeNode root,int k){  
	        if(root == null || k == 0){  
	            return null;  
	        }  
	        int[] temp = {k};  
	        return inorderTraversalCore(root,temp);  
	    }  
	
	public TreeNode inorderTraversalCore(TreeNode root,int[] k){  
        TreeNode target = null;  
          
        if(root.left != null )  
            target = inorderTraversalCore(root.left,k);  
          
        if(target == null){  
            if(k[0] == 1)  
                target = root;  
            k[0]--;  
        }  
        if(target == null && root.right != null)  
            target = inorderTraversalCore(root.right, k);  
          
        return target;  
    }  
	
	

}
