package cn.bupt.swordToOffer;

import java.util.Stack;

public class IsPopOrder {
	
	
	public static void main(String[] args) {
		IsPopOrder isPopOrder=new IsPopOrder();
		int pushA[]={1,2,3,4,5};
		int popA[]={4,3,5,1,2};
		System.out.println(isPopOrder.isPopOrder(pushA, popA));
	}
	
	public boolean isPopOrder(int [] pushA,int [] popA) {
		Stack<Integer> stack=new Stack<Integer>();
		int popIndex=0;
		for(int i=0;i<pushA.length;i++){
			stack.push(pushA[i]);
			while(!stack.isEmpty()&&stack.peek()==popA[popIndex]){
				stack.pop();
				++popIndex;
			}
		}
		return stack.isEmpty();
	      
    }

}
