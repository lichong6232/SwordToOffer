package cn.bupt.swordToOffer;

import java.util.Arrays;

public class ReOrderArray {
	
	public static void main(String[] args) {
		ReOrderArray reOrderArray=new ReOrderArray();
		int a[]={2,3,5,8,7,4,3,5,2,1};
		reOrderArray.reOrderArray(a);
		System.out.println(Arrays.toString(a));
	}

	 public void reOrderArray(int [] array) {
		 
		 for(int i=1;i<array.length;i++){
			 if(array[i]%2==0){
				 continue;
			 }
			 int temp=array[i];
			 int j=i-1;
			 while(j>=0&&array[j]%2==0){
				 array[j+1]=array[j];
				 --j;
			 }
			 array[j+1]=temp;
		 }
	        
	 }
	
}
