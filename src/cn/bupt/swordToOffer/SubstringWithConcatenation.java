package cn.bupt.swordToOffer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SubstringWithConcatenation {
	
	public static void main(String[] args) {
		SubstringWithConcatenation substringWithConcatenation=new SubstringWithConcatenation();
		
		String s="barfoothefoobarman";
		String words[]={"foo", "bar"};
		List<Integer> result=substringWithConcatenation.findSubstring(s, words);
		System.out.println(result);
		
	}
	
	public List<Integer> findSubstring(String s, String[] words) {
		List<Integer> result=new ArrayList<Integer>();
		
		if(s==null||words==null||"".equals(s)){
			return result;
		}
		
		Map<String,Integer> map=new HashMap<String,Integer>();
		for(String word:words){
			map.put(word, map.containsKey(word)?map.get(word)+1:1);
		}
		
		int wordLength=words[0].length();
		
		for(int i=0;i<=s.length()-wordLength*words.length;i++){
			HashMap<String, Integer> tempMap=new HashMap<String,Integer>(map);
			for(int j=0;j<words.length;j++){
				String subString=s.substring(i+j*wordLength,i+j*wordLength+wordLength);
				if(tempMap.containsKey(subString)){
					int count=tempMap.get(subString);
					if(count==1)
						tempMap.remove(subString);
					else
						tempMap.put(subString, count-1);
					if(tempMap.isEmpty())
						result.add(i);
					
				}else{
					break;
				}
			}
		}
		
		
		
		return result;
	}

}
