package cn.bupt.swordToOffer;

public class Add {
	
	public static void main(String[] args) {
		Add add=new Add();
		System.out.println(add.Add1(2, 3));
	}
	
	//µÝ¹é°æ±¾
	public int Add(int num1,int num2) {
        return num1==0?num2:Add((num1&num2)<<1,num1^num2);
    }
	//·ÇµÝ¹é°æ±¾
	public int Add1(int num1,int num2) {
       while(num1!=0){
    	   int temp=num1;
    	   num1=(num1&num2)<<1;
    	   num2=num2^temp;
       }
       return num2;
    }
	

}
