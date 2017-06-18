package cn.bupt.swordToOffer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class PrintMinNumber {
	
	public static void main(String[] args) {
		PrintMinNumber printMinNumber=new PrintMinNumber();
		int numbers[]={3,32,321};
		System.out.println(printMinNumber.printMinNumber2(numbers));
	}
	//改进版
	public String printMinNumber1(int [] numbers) {
		List<Integer> list=new ArrayList<Integer>();
		for(int number:numbers){
			list.add(number);
		}
		Collections.sort(list, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				String s1=String.valueOf(o1)+String.valueOf(o2);
				String s2=String.valueOf(o2)+String.valueOf(o1);
				return s1.compareTo(s2);
			}
		});
		StringBuffer result=new StringBuffer();
		for(int number:list){
			result.append(number);
		}
		return result.toString();
		
	}
	
	//上面一个方法的另外一个版本
	public String printMinNumber2(int [] numbers) {
		PriorityQueue<Integer> queue=new PriorityQueue<Integer>(10,new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				String s1=String.valueOf(o1)+String.valueOf(o2);
				String s2=String.valueOf(o2)+String.valueOf(o1);
				return s1.compareTo(s2);
			}
		});
		for(int number:numbers){
			queue.add(number);
		}
		StringBuffer result=new StringBuffer();
		while(!queue.isEmpty()){
			result.append(queue.poll());
		}
		return result.toString();
		
		
	}
	
	
	
	
	public String printMinNumber(int [] numbers) {
		
		PriorityQueue<String> queue=new PriorityQueue<String>(30,new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				// TODO Auto-generated method stub
				if(s1.equals(s2)){
					return 0;
				}
				int s1Length=s1.length();
				int s2Length=s2.length();
				int i=0,j=0;
				while(i<s1Length&&j<s2Length){
					if(s1.charAt(i)!=s2.charAt(j)){
						return s1.charAt(i)-s2.charAt(j);
					}
					++i;
					++j;
				}
				
				if(s1Length>s2Length){
					while(i<s1Length&&s1.charAt(i)==s2.charAt(j-1)){
						i++;
					}
					if(i==s1Length){
						return 0;
					}
					return s1.charAt(i)-s1.charAt(i-1);
				}else{
					while(j<s2Length&&s2.charAt(j)==s2.charAt(i-1)){
						j++;
					}
					if(j==s2Length){
						return 0;
					}
					return s2.charAt(j)-s2.charAt(j-1);
				}
			
			}
		
		});
		for(int number:numbers){
			queue.add(String.valueOf(number));
		}
		StringBuffer result=new StringBuffer();
		while(!queue.isEmpty()){
			result.append(queue.poll());
		}
		
		
		return result.toString();
    }

}
