package cn.bupt.swordToOffer;

public class StrToInt {
	
	public static void main(String[] args) {
		StrToInt strToInt=new StrToInt();
		System.out.println(strToInt.StrToInt("123"));
	}
	
	public int StrToInt(String str) {
		if(str==null||"".equals(str))
			return 0;
        int result=0;
        boolean f=false;
        if(str.charAt(0)>='A'&&str.charAt(0)<='z'){
    		return 0;
    	}
        if(str.charAt(0)>='0'&&str.charAt(0)<='9'){
        	result=str.charAt(0)-48;
        }else if(str.charAt(0)=='-'){
        	f=true;
        }
        for(int i=1;i<str.length();i++){
        	 if(str.charAt(i)>='0'&&str.charAt(i)<='9'){
        		 result=result*10+str.charAt(i)-48;
        	 }else{
        		 return 0;
        	 }
        }
        if(f){
        	result=~result+1;
        }
        
        return result;
    }

}
