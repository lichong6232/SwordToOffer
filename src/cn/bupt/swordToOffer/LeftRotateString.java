package cn.bupt.swordToOffer;

public class LeftRotateString {
	
	public static void main(String[] args) {
		LeftRotateString leftRotateString=new LeftRotateString();
		String s="1234567";
		System.out.println(leftRotateString.LeftRotateString1(s, 6));
	}
	
	public String LeftRotateString(String str,int n) {
		if(str.length()==0)
			return "";
		
        char c[]=str.toCharArray();
        int strLength=str.length();
        int i=0;
        n=n%strLength;
        while(i<n){
        	char temp=c[0];
        	for(int j=1;j<strLength;j++){
        		c[j-1]=c[j];
        	}
        	c[strLength-1]=temp;
        	
        	++i;
        }
		return String.valueOf(c);
    }
	
	public void reverse(char c[],int start,int end){
		int i=start;
		int j=end;
		while(i<j){
			c[i]=(char) (c[i]^c[j]);
			c[j]=(char) (c[i]^c[j]);
			c[i]=(char) (c[i]^c[j]);
			++i;
			--j;
		}
	}
	
	public String LeftRotateString1(String str,int n) {
		if(str.length()==0)
			return "";
		char c[]=str.toCharArray();
		reverse(c, 0, n-1);
		reverse(c, n, c.length-1);
		reverse(c, 0, c.length-1);
		return String.valueOf(c);
	}
	
	

}
