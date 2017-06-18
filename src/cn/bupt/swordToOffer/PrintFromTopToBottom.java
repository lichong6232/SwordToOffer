package cn.bupt.swordToOffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;



public class PrintFromTopToBottom {
	
	class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }

	}
	
	public static void main(String[] args) {
		PrintFromTopToBottom.TreeNode node1=new PrintFromTopToBottom().new TreeNode(1);
		PrintFromTopToBottom.TreeNode node2=new PrintFromTopToBottom().new TreeNode(2);
		PrintFromTopToBottom.TreeNode node3=new PrintFromTopToBottom().new TreeNode(3);
		PrintFromTopToBottom.TreeNode node4=new PrintFromTopToBottom().new TreeNode(4);
		PrintFromTopToBottom.TreeNode node5=new PrintFromTopToBottom().new TreeNode(5);
		PrintFromTopToBottom.TreeNode node6=new PrintFromTopToBottom().new TreeNode(6);
		PrintFromTopToBottom.TreeNode node7=new PrintFromTopToBottom().new TreeNode(7);
		PrintFromTopToBottom.TreeNode node8=new PrintFromTopToBottom().new TreeNode(8);
		PrintFromTopToBottom.TreeNode node9=new PrintFromTopToBottom().new TreeNode(9);
		PrintFromTopToBottom.TreeNode node10=new PrintFromTopToBottom().new TreeNode(10);
		PrintFromTopToBottom.TreeNode node11=new PrintFromTopToBottom().new TreeNode(11);
		PrintFromTopToBottom.TreeNode node12=new PrintFromTopToBottom().new TreeNode(12);
		PrintFromTopToBottom.TreeNode node13=new PrintFromTopToBottom().new TreeNode(13);
		PrintFromTopToBottom.TreeNode node14=new PrintFromTopToBottom().new TreeNode(14);
		PrintFromTopToBottom.TreeNode node15=new PrintFromTopToBottom().new TreeNode(15);
		node1.left=node2;
		node1.right=node3;
		node2.left=node4;
		node2.right=node5;
		node3.left=node6;
		node3.right=node7;
		node4.left=node8;
		node4.right=node9;
		node5.left=node10;
		node5.right=node11;
		node6.left=node12;
		node6.right=node13;
		node7.left=node14;
		node7.right=node15;
		PrintFromTopToBottom printFromTopToBottom=new PrintFromTopToBottom();
		ArrayList<Integer> list=printFromTopToBottom.PrintFromTopToBottom(node1);
		System.out.println(list);
	
	}
	
	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		Queue<TreeNode> queue=new LinkedList<TreeNode>();
		if(root!=null){
			queue.add(root);
			list.add(root.val);
			while(!queue.isEmpty()){
				TreeNode node=queue.poll();
				if(node.left!=null){
					list.add(node.left.val);
					queue.add(node.left);
					
				}
				if(node.right!=null){
					list.add(node.right.val);
					queue.add(node.right);
				}
				
			}
		}
		return list;
        
    }
	
	public void print(TreeNode node,ArrayList<Integer> list){
		if(node!=null){
			if(node.left!=null){
				list.add(node.left.val);
			}
			if(node.right!=null){
				list.add(node.right.val);
			}
			print(node.left, list);
			print(node.right, list);
		}
	}

}
