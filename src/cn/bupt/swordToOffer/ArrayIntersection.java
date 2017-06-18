package cn.bupt.swordToOffer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ArrayIntersection {
	
	public static void main(String[] args) {
		int a1[]={6,2,4,1};
		int a2[]={2,9,4,3};
		List<Integer> list=getIntersection(a1, a2);
		System.out.println(list);
	}
	
	public static List<Integer> getIntersection(int a1[],int a2[]){
		List<Integer> result=new ArrayList<Integer>();
		int mergeArray[]=new int[a1.length+a2.length];
		for(int i=0;i<a1.length;i++){
			mergeArray[i]=a1[i];
		}
		for(int j=0;j<a1.length;j++){
			mergeArray[j+a1.length]=a2[j];
		}
		int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
		for(int i=0;i<mergeArray.length;i++){
			if(mergeArray[i]<min){
				min=mergeArray[i];
			}
			if(mergeArray[i]>max){
				max=mergeArray[i];
			}
			
		}
		int c[]=new int[max-min+1];
		for(int i=0;i<mergeArray.length;i++){
			c[mergeArray[i]-min]++;
		}
		for(int i=0;i<c.length;i++){
			if(c[i]>1){
				result.add(i+min);
			}
		}
		
		return result;
	}

}
