package cn.bupt.swordToOffer;

import java.util.ArrayList;

public class FindNumbersWithSum {
	
	public static void main(String[] args) {
		FindNumbersWithSum findNumbersWithSum=new FindNumbersWithSum();
		int array[]={};
		System.out.println(findNumbersWithSum.FindNumbersWithSum(array, 0));
	}
	
	public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
		ArrayList<Integer> res=new ArrayList<Integer>();
		int i=0,j=array.length-1;
		/*while(i<j){
			
			if(array[i]+array[j]==sum){
				res.add(array[i]);
				res.add(array[j]);
				break;
			}
			while(i<j&&array[i]+array[j]>sum){
				--j;
			}
			while(i<j&&array[i]+array[j]<sum){
				++i;
			}
		}*/
		
		while(i<j&&array[i]+array[j]>sum){
			--j;
		}
		while(i<j&&array[i]+array[j]<sum){
			++i;
		}
		if(i<j){
			if(array[i]+array[j]==sum){
				res.add(array[i]);
				res.add(array[j]);
			
			}
		}
		
		
		
		return res;
	}

}
