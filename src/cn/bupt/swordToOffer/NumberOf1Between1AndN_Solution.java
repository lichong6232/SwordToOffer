package cn.bupt.swordToOffer;

public class NumberOf1Between1AndN_Solution {
	
	public static void main(String[] args) {
		NumberOf1Between1AndN_Solution numberOf1Between1AndN_Solution=new NumberOf1Between1AndN_Solution();
//		System.out.println(numberOf1Between1AndN_Solution.NumberOf1Between1AndN_Solution(20));
		int n=30;
//		System.out.println(numberOf1Between1AndN_Solution.numberOf2Between1AndN_Solution(n));
		System.out.println(numberOf1Between1AndN_Solution.numberOfMBetween1AndN_Solution(n, 1));
	}
	
	public int numberOfMBetween1AndN_Solution(int n,int m){
		int count=0;
		for(int i=1;i<=n;i*=10){
			count+=(n/i+9-m)/10*i+(n/i%10==m?n%i+1:0);
		}
		return count;
	}
	
	public int numberOf2Between1AndN_Solution(int n) {
		 int count=0;
		 for(int i=1;i<=n;i*=10)
			 count+=(n/i+7)/10*i+(n/i%10==2?n%i+1:0);
		 return count;
		    
	 }
	
	 public int NumberOf1Between1AndN_Solution(int n) {
		 int count=0;
		 for(int i=1;i<=n;i*=10)
			 count+=(n/i+8)/10*i+(n/i%10==1?n%i+1:0);
		 return count;
		    
	 }

}
