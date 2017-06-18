package cn.bupt.swordToOffer;

import java.util.Scanner;

public class WildcardMatching {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String p=sc.next();
		boolean match=isMatch(s, p);
		System.out.println(match==true?1:0);
	}
	
	public static boolean isMatch(String s,String p){
		if("".equals(p))
			return s.equals(p);
		if("".equals(s)){
			for(int i=0;i<p.length();i++){
				if(p.charAt(i)!='*'){
					return false;
				}
			}
			return true;
		}
		boolean match[][]=new boolean[p.length()+1][s.length()+1];
		match[0][0]=true;
		
		for(int i=1;i<=p.length();i++){
			match[i][0]=match[i-1][0]&&p.charAt(i-1)=='*';
			for(int j=1;j<=s.length();j++){
				if(p.charAt(i-1)=='*'){
					match[i][j]=match[i-1][j]||match[i][j-1];
				}else if(p.charAt(i-1)==s.charAt(j-1)||p.charAt(i-1)=='?'){
					match[i][j]=match[i-1][j-1];
				}else{
					match[i][j]=false;
				}
			}
		}
		
		return match[p.length()][s.length()];
	}

}
