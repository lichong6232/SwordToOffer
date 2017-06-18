package cn.bupt.swordToOffer;

import java.util.Stack;



public class ConvertTree2List {
	
	public static void main(String[] args) {
		TreeNode node1=new TreeNode(5);
		TreeNode node2=new TreeNode(3);
		TreeNode node3=new TreeNode(8);
		TreeNode node4=new TreeNode(1);
		TreeNode node5=new TreeNode(4);
		TreeNode node6=new TreeNode(9);
		TreeNode node7=new TreeNode(2);
		TreeNode node8=new TreeNode(7);
		node1.left=node2;
		node1.right=node3;
		node2.left=node4;
		node2.right=node5;
		node4.right=node7;
		node3.right=node6;
		node3.left=node8;
//		preViste(node1);
//		inViste(node1);
		ConvertTree2List convertTree2List=new ConvertTree2List();
		TreeNode convertTreeNode=convertTree2List.Convert(node1);
		convertTree2List.visit(convertTreeNode);
	}
	
	public void visit(TreeNode node){
		TreeNode current=node;
		while(current!=null){
			System.out.println(current.val);
			current=current.right;
		}
	}
	
	public static void inViste(TreeNode root){
		TreeNode curr=root;
		Stack<TreeNode> stack=new Stack<TreeNode>();
		while(curr!=null){
		
			stack.add(curr);
			curr=curr.left;
			while(curr==null&&!stack.isEmpty()){
				TreeNode temp=stack.pop();
				System.out.println(temp.val);
				curr=temp.right;
			}
		}
		
	}
	
	public static void preViste(TreeNode root){
		TreeNode curr=root;
		Stack<TreeNode> stack=new Stack<TreeNode>();
		while(curr!=null){
			System.out.println(curr.val);
			stack.add(curr);
			curr=curr.left;
			while(curr==null&&!stack.isEmpty()){
				TreeNode temp=stack.pop();
				curr=temp.right;
			}
		}
	}
	 public TreeNode Convert1(TreeNode pRootOfTree){
		 
		 return null;
		 
	 }
	
	
	 public TreeNode Convert(TreeNode pRootOfTree) {
		 TreeNode head=null;
		 TreeNode curr=pRootOfTree;
			Stack<TreeNode> stack=new Stack<TreeNode>();
			TreeNode pre=null;
			while(curr!=null){
				stack.add(curr);
				curr=curr.left;
				while(curr==null&&!stack.isEmpty()){
					TreeNode node=stack.pop();
					curr=node.right;
					if(head==null){
						head=node;
						pre=head;
					}else{
						pre.right=node;
						node.left=pre;
						pre=node;
						
					}
				}
			}
			
			return head;
	  }

}
