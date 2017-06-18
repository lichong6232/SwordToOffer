package cn.bupt.swordToOffer;

import java.util.ArrayList;

public class FlowWindow {
	
	public ArrayList<Integer> maxInWindows(int [] num, int size){
		
		ArrayList<Integer> result=new ArrayList<Integer>();
		if(size>0){
			for(int i=0;i<num.length-size+1;i++){
				int tempMax=Integer.MIN_VALUE;
				for(int j=i;j<i+size;j++){
					if(num[j]>tempMax){
						tempMax=num[j];
					}
					
				}
				result.add(tempMax);
				
			}
		}
		
      
		return result;
    }

}
