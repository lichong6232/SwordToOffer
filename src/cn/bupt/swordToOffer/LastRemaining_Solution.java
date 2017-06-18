package cn.bupt.swordToOffer;

import java.util.Iterator;
import java.util.LinkedList;


public class LastRemaining_Solution {
	
	public static void main(String[] args) {
		LastRemaining_Solution lastRemaining_Solution=new LastRemaining_Solution();
		int remain=lastRemaining_Solution.lastRemaining_Solution2(6, 6);
		System.out.println(remain);
	}
	
	public int lastRemaining_Solution(int n, int m) {
		if(n==0||m==0)
			return -1;
		
		LinkedList<Integer> list=new LinkedList<Integer>();
		for(int i=0;i<n;i++){
			list.add(i);
		}
		int i=-1;
		Iterator<Integer> it=null;
		while(list.size()>1){
			it=list.iterator();
			while(list.size()>1&&it.hasNext()){
				++i;
				it.next();
				if(i==(m-1)%list.size()){
					it.remove();
					i=-1;
				}
			}

		}
		return list.get(0);
        
    }
	
	
	public int lastRemaining_Solution1(int n, int m) {
		if(n==0||m==0)
			return -1;
		
		LinkedList<Integer> list=new LinkedList<Integer>();
		for(int i=0;i<n;i++){
			list.add(i);
		}
		int index=0;
		while(list.size()>1){
			index=(index+m-1)%list.size();
			list.remove(index);
		}
		return list.get(0);
        
    }
	
	public int lastRemaining_Solution2(int n, int m) {
		if(n<1||m<1)
			return -1;
		if(n==1)
			return 0;
		return (lastRemaining_Solution2(n-1, m)+m)%n;
	}

}
