package cn.bupt.swordToOffer;

import java.util.ArrayList;

public class FindPath {
	
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
		FindPath findPath=new FindPath();
		ArrayList<ArrayList<Integer>> path=findPath.FindPath3(root, 15);
		System.out.println(path);
		
		
	}
	//方法一
	public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
      
		ArrayList<ArrayList<Integer>> path=new ArrayList<ArrayList<Integer>>();
        if(root==null)
        	return path;
		ArrayList<Integer> tempPath=new ArrayList<Integer>();
        tempPath.add(root.val);
        getPath2(root, path, tempPath, target);
        return path;
    }
	
	
	
	
	public void getPath(TreeNode root,ArrayList<ArrayList<Integer>> path,ArrayList<Integer> tempPath,int target){
			
			if(root.left==null&&root.right==null){
				int sumPath=0;
				for(int p:tempPath){
					sumPath+=p;
				}
				if(sumPath==target){
					ArrayList<Integer> temp=new ArrayList<Integer>();
					temp.addAll(tempPath);
					path.add(temp);
				}
				
			}else{
				if(root.left!=null){
					tempPath.add(root.left.val);
					getPath(root.left, path, tempPath, target);
					tempPath.remove(tempPath.size()-1);
					
				}
				if(root.right!=null){
					tempPath.add(root.right.val);
					getPath(root.right, path, tempPath, target);
					tempPath.remove(tempPath.size()-1);
					
				}
				
				
			}
		}
	
	//方法二
	public ArrayList<ArrayList<Integer>> FindPath2(TreeNode root,int target) {
	      
		ArrayList<ArrayList<Integer>> path=new ArrayList<ArrayList<Integer>>();
        if(root==null)
        	return path;
		ArrayList<Integer> tempPath=new ArrayList<Integer>();
        getPath2(root, path, tempPath, target);
        return path;
    }
	
	public void getPath2(TreeNode root,ArrayList<ArrayList<Integer>> path,ArrayList<Integer> tempPath,int target){
		
		if(root==null)
			return ;
		tempPath.add(root.val);
		if(root.left==null&&root.right==null){
			int sumPath=0;
			for(int p:tempPath){
				sumPath+=p;
			}
			if(sumPath==target){
				ArrayList<Integer> temp=new ArrayList<Integer>();
				temp.addAll(tempPath);
				path.add(temp);
			}
		}
		getPath2(root.left, path, tempPath, target);
		getPath2(root.right, path, tempPath, target);
		tempPath.remove(tempPath.size()-1);
		
	}
	
	//方法三
	ArrayList<ArrayList<Integer>> path=new ArrayList<ArrayList<Integer>>();
	ArrayList<Integer> tempPath=new ArrayList<Integer>();
	public ArrayList<ArrayList<Integer>> FindPath3(TreeNode root,int target) {
		if(root==null) return path;
		tempPath.add(root.val);
		target-=root.val;
		if(target==0&&root.left==null&&root.right==null)
			path.add(new ArrayList<Integer>(tempPath));
		FindPath3(root.left, target);
		FindPath3(root.right, target);
		tempPath.remove(tempPath.size()-1);
		return path;
    }
		
		
	

}
