package cn.bupt.swordToOffer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FlowMedian {
	
	private List<Integer> list=new ArrayList<Integer>();
	
	public static void main(String[] args) {
		int arr[]={5,2,3,4,1,6,7,0,8};
		FlowMedian flowMedian=new FlowMedian();
		for(int a:arr){
			flowMedian.Insert(a);
			System.out.println(flowMedian.GetMedian());
		}
	}
	
	 public void Insert(Integer num) {
		    list.add(num);
	 }

	 public Double GetMedian() {
	        Collections.sort(list);
	        int mid=(list.size()-1)/2;
	        if(list.size()%2==0){
	        	return  ((double)(list.get(mid)+list.get(mid+1))/2);
	        }else{
	        	return (double)list.get(mid);
	        }
	 }


}
