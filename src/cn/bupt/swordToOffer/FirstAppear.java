package cn.bupt.swordToOffer;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;


public class FirstAppear {
	
	private Queue<Character> queue=new LinkedList<Character>();
	private Set<Character> set=new HashSet<Character>();
	
	public static void main(String[] args) {
		FirstAppear isNumber=new FirstAppear();
		char c[]={'g','o','o','g','l','e'};
		for(int i=0;i<c.length;i++){
			isNumber.Insert(c[i]);
			System.out.println(isNumber.FirstAppearingOnce());
		}
		
	}
	
	 //Insert one char from stringstream
    public void Insert(char ch){
    	if(!set.contains(ch)){
    		if(queue.contains(ch)){
    	    	  queue.remove(ch);
    	    	  set.add(ch);
    	    }else{
    	    	queue.add(ch);
    	    }
    	}
    	
       
    }
  //return the first appearence once char in current stringstream
    public char FirstAppearingOnce(){
    	if(queue.isEmpty()){
    		return '#';
    	}
    	return queue.peek();
    }

}
