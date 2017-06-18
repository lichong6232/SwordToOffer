package cn.bupt.swordToOffer;

import java.util.Stack;

public class StackMinNumber {
	
	private Stack<Integer> stack=new Stack<Integer>();
	private Stack<Integer> minStack=new Stack<Integer>();
	
	public void push(int node) {
		stack.push(node);
		if(minStack.isEmpty()){
			minStack.push(node);
		}else if(node<minStack.peek()){
			minStack.push(node);
		}
	        
    }
    
    public void pop() {
        if(stack.peek()==minStack.peek())
        	minStack.pop();
        stack.pop();
    }
    
    public int top() {
    	return stack.peek();
        
    }
    
    public int min() {
    	return minStack.peek();
        
    }

}
