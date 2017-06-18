package cn.bupt.swordToOffer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class PrintZList {
	
	public static void main(String[] args) {
		TreeNode node1=new TreeNode(5);
		TreeNode node2=new TreeNode(2);
		TreeNode node3=new TreeNode(6);
		TreeNode node4=new TreeNode(1);
		TreeNode node5=new TreeNode(4);
		TreeNode node6=new TreeNode(9);
		TreeNode node7=new TreeNode(3);
		TreeNode node8=new TreeNode(8);
		TreeNode node9=new TreeNode(10);
		node1.left=node2;
		node1.right=node3;
		node2.left=node4;
		node2.right=node5;
		node3.right=node6;
		node6.left=node8;
		node6.right=node9;
		node5.left=node7;
		PrintZList printZList=new PrintZList();
		ArrayList<ArrayList<Integer>> result= printZList.Print(node1);
		System.out.println(result);
		
		
		
	}
	
	public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
		ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
		Queue<TreeNode> queue=new LinkedList<TreeNode>();
		if(pRoot==null)
			return result;
		queue.add(pRoot);
		int tag=0;
		while(!queue.isEmpty()){
			ArrayList<Integer> list=new ArrayList<Integer>();
			int n=queue.size();
			for(int i=0;i<n;i++){
				TreeNode temp=queue.poll();
				if(temp.left!=null)
					queue.add(temp.left);
				if(temp.right!=null)
					queue.add(temp.right);
				list.add(temp.val);
				
			}
			if(tag==1)
				Collections.reverse(list);
			tag=tag==0?1:0;
			result.add(list);
		}
		return result;
    }
	
	
	
	
	public void layerPrint(TreeNode root){
		
	}

}
