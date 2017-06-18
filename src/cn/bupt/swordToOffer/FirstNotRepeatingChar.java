package cn.bupt.swordToOffer;

import java.util.HashMap;
import java.util.Map;

public class FirstNotRepeatingChar {
	
	public static void main(String[] args) {
		FirstNotRepeatingChar firstNotRepeatingChar=new FirstNotRepeatingChar();
		String str="google";
		System.out.println(firstNotRepeatingChar.firstNotRepeatingChar(str));
	}
	
	public int firstNotRepeatingChar1(String str) {
		if(str==null||"".equals(str)){
			return -1;
		}
		
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++){
			char charI=str.charAt(i);
			map.put(charI,map.containsKey(charI)?map.get(charI)+1:1);
		}
		
		for(int i=0;i<str.length();i++){
			if(map.get(str.charAt(i))==1){
				
			}
		}
		
		
        return -1;
	}
	
	public int firstNotRepeatingChar(String str) {
		
		if(str==null||"".equals(str)){
			return -1;
		}
		int min='A';
		int max='z';
		System.out.println(max-min+1);
		int c[]=new int[max-min+1]; 
		for(int i=0;i<str.length();i++){
			++c[str.charAt(i)-min];
		}
		for(int i=0;i<str.length();i++){
			if(c[str.charAt(i)-min]==1){
				return i;
			}
		}
        return -1;
    }

}
