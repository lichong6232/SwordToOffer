package cn.bupt.swordToOffer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Stack;

public class LongestValidParentheses {
	
	
	public static void main(String[] args) throws IOException {
		
		FileReader fr=new FileReader(new File("H:\\files\\test.txt"));
		char c[]=new char[10*2014];
		fr.read(c);
		String s=new String(c);
		int max=solution(s);
		System.out.println(max);
		
	}
	
	
	
	public static int solution(String s){
		
		if(s==null||"".equals(s)){
			return 0;
		}
		Stack<Integer> stack=new Stack<Integer>();
		int left=-1;
		int max=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='('){
				stack.push(i);
			}else{
				if(stack.isEmpty()){
					left=i;
				}else{
					stack.pop();
					if(stack.isEmpty()){
						max=Math.max(max,i-left);
					}else{
						max=Math.max(max, i-stack.peek());
					}
				}
			}
		}
		
		return max;
	}

}
