package cn.bupt.swordToOffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class SerializeTree {
	
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
		SerializeTree serializeTree=new SerializeTree();
		String seri=serializeTree.Serialize(node1);
//		System.out.println(seri);
		TreeNode root=serializeTree.Deserialize(seri);
		ArrayList<ArrayList<Integer> > result=serializeTree.Print(root);
		System.out.println(result);
		
	}
	
	ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
		 
		 ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
			Queue<TreeNode> queue=new LinkedList<TreeNode>();
			if(pRoot==null)
				return result;
			queue.add(pRoot);
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
				result.add(list);
			}
			return result;
	 }
	
	public void outPut(TreeNode root){
		if(root!=null){
			System.out.println(root.val);
			outPut(root.left);
			outPut(root.right);
		}
	}
	
	String Serialize(TreeNode root) {
		StringBuffer result=new StringBuffer();
		Queue<TreeNode> queue=new LinkedList<TreeNode>();
		if(root==null)
			return result.toString();
		queue.add(root);
		result.append(root.val);
		while(!queue.isEmpty()){
			TreeNode temp=queue.poll();
			result.append(",");
			if(temp.left!=null){
				queue.add(temp.left);
				
				result.append(temp.left.val);
			}else{
				result.append("#");
			}
			result.append(",");
			if(temp.right!=null){
				queue.add(temp.right);
				result.append(temp.right.val);
			}else{
				result.append("#");
			}
			
			
		}
		return result.toString();
	}
	TreeNode Deserialize(String str) {
		String s[]=str.split(",");
		if(s.length==1&&"".equals(s[0]))
			return null;
		int i=1;
		Queue<TreeNode> queue=new LinkedList<TreeNode>();
		TreeNode root=new TreeNode(Integer.parseInt(s[0]));
		queue.add(root);
		while(i<s.length){
			int n=queue.size();
			for(int k=0;k<n;k++){
				TreeNode node=queue.poll();
				TreeNode leftNode=null,rightNode=null;
				if(!"#".equals(s[i])){
					leftNode=new TreeNode(Integer.parseInt(s[i]));
					queue.add(leftNode);
				}
				node.left=leftNode;
				i++;
				if(!"#".equals(s[i])){
					rightNode=new TreeNode(Integer.parseInt(s[i]));
					queue.add(rightNode);
				}
				node.right=rightNode;
				i++;
				
			}
		}
		return root;
	}

}
