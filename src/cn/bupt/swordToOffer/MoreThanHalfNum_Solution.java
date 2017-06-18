package cn.bupt.swordToOffer;


public class MoreThanHalfNum_Solution {
	
	public static void main(String[] args) {
		MoreThanHalfNum_Solution moreThanHalfNum_Solution=new MoreThanHalfNum_Solution();
		int a[]={1,2,3,2,2,2,5,4,2};
		System.out.println(moreThanHalfNum_Solution.moreThanHalfNum_Solution(a));
	}
	
	public int moreThanHalfNum_Solution(int [] array) {
		
		if(array.length==0)
			return 0;
		if(array.length==1)
			return array[0];
        
		int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
		for(int i=0;i<array.length;i++){
			if(array[i]>max){
				max=array[i];
			}
			if(array[i]<min){
				min=array[i];
			}
		}
		int c[]=new int[max-min+1];
		for(int i=0;i<array.length;i++){
			c[array[i]-min]++;
		}
		
		for(int i=0;i<c.length;i++){
			if(c[i]>array.length/2){
				return i+min;
			}
		}
		return 0;
		
    }

}
