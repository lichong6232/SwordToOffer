package cn.bupt.swordToOffer;

public class NumberOf1 {
	
	public static void main(String[] args) {
		NumberOf1 numberOf1=new NumberOf1();
		System.out.println(numberOf1.numberOf2(7));
	}

	 public int numberOf1(int n) {
		int i=1;
		int sum=n&1;
		while(i<=31){
			if(((n>>i)&1)==1){
				++sum;
			}
			++i;
		}
		return sum;
	 }
	 //·½·¨¶þ
	 public int numberOf2(int n) {
		 int count=0;
			while(n!=0){
				++count;
				n=n&(n-1);
			}
		return count;
	 }
	 
}
