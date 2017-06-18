package cn.bupt.swordToOffer;

public class StringMatch {
	
	
	public static void main(String[] args) {
		StringMatch stringMatch=new StringMatch();
		String s="aa";
		String p="a*";
		char str[]=s.toCharArray();
		char pattern[]=p.toCharArray();
		System.out.println(stringMatch.match(str, pattern));
	}
	
	public boolean match(char[] str, char[] pattern){
		if(str.length==0){
			if(pattern.length==1){
				return false;
			}
			
			for(int i=1;i<pattern.length;i++){
				if(pattern[i]!='*')
					return false;
				
			}
			return true;
		}
		if(pattern.length==0){
			return str.length==0;
		}
		
        int strLength=str.length;
        int patternLength=pattern.length;
        boolean match[][]=new boolean[patternLength+1][strLength+1];
        match[0][0]=true;
        for(int i=1;i<=patternLength;i++){
        	match[i][0]=match[i-1][0]&&pattern[i-1]=='*';
        	for(int j=1;j<=strLength;j++){
        		if(pattern[i-1]=='*'){
        			if(i<=1){
        				match[i][j]=match[i-1][j]||match[i-1][j-1];
        			}else{
        				match[i][j]=match[i-1][j]||match[i-2][j];
        			}
        			
        		}else if(pattern[i-1]==str[j-1]||pattern[i-1]=='.'){
        			match[i][j]=match[i-1][j-1];
        		}else{
        			match[i][j]=false;
        		}
        	}
        }
		
		return match[patternLength][strLength];
    }

}
