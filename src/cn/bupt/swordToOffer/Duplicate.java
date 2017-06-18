package cn.bupt.swordToOffer;

public class Duplicate {
	
	public static void main(String[] args) {
		Duplicate duplicate=new Duplicate();
		int result[]=new int[1];
		int numbers[]={2,3,1,0,2,5,3};
		boolean tag=duplicate.duplicate(numbers, numbers.length, result);
		System.out.println(result[0]);
		System.out.println(tag);
	}
	
	public boolean duplicate(int numbers[],int length,int [] duplication) {
		
		if(length==0){
			return false;
		}
		
		int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
		for(int i=0;i<length;i++){
			int temp=numbers[i];
			if(temp>max){
				max=temp;
			}
			if(temp<min){
				min=temp;
			}
		}
		if(min<0||max>length-1){
			return false;
		}
		
		int c[]=new int[max-min+1];
		for(int i=0;i<numbers.length;i++){
			++c[numbers[i]-min];
		}
		for(int i=0;i<c.length;i++){
			if(c[i]>1){
				duplication[0]=i+min;
				return true;
			}
		}
		
		return false;
	    
    }

}
