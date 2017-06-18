package cn.bupt.swordToOffer;

public class IsLucky {
	
	public static void main(String[] args) {
		IsLucky isLucky=new IsLucky();
		int a[]={0,3,2,6,4};
		System.out.println(isLucky.isContinuous(a));
	}
	
	 public boolean isContinuous(int [] numbers) {
		 
		 if(numbers==null||numbers.length!=5){
			 return false;
		 }
		 
		 for(int i=0;i<numbers.length;i++){
			 if(numbers[i]==0) continue;
			 for(int j=i+1;j<numbers.length;j++){
				 if(numbers[j]==0) continue;
				 if(Math.abs(numbers[i]-numbers[j])>=5||numbers[i]==numbers[j]){
					
					 return false;
				 }
			 }
		 }
		 return true;

	 }

}
