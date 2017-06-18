package cn.bupt.swordToOffer;


import java.util.ArrayList;
import java.util.List;

public class StringPermutation {
	
	public static void main(String[] args) {
		
		StringPermutation stringPermutation=new StringPermutation();
		List<String> list=stringPermutation.Permutation("123");
//		System.out.println(list.size());
		for(String s:list){
			System.out.println(s);
		}
	}
	
	 public ArrayList<String> Permutation(String str) {
	       return getPermutation(str.toCharArray());
	 }
	 
	 public int getLastIndex(char c[],int currentIndex){
		 int lastIndex=currentIndex+1;
		 char nowValue=c[currentIndex-1];
		 for(;lastIndex<c.length;lastIndex++){
			 if(c[lastIndex]<=nowValue){
				 break;
			 }
		 }
		 return lastIndex-1;
	 }
	 
	 public void swap(char c[],int i,int j){
		 if(i!=j){
			 c[i]=(char) (c[i]^c[j]);
			 c[j]=(char) (c[i]^c[j]);
			 c[i]=(char) (c[i]^c[j]);
		 }
	 }
	 
	 public void reverse(char c[],int start){
		 int i=start;
		 int j=c.length-1;
		 while(i<j){
			 swap(c, i, j);
			 i++;
			 j--;
		 }
	 }
	 
	 public ArrayList<String> getPermutation(char c[]){
		 ArrayList<String> list=new ArrayList<String>();
		 if(c.length==0){
			 return list;
		 }
		 
		 list.add(String.valueOf(c));
		 
		 int length=c.length;
		 while(true){
			 int i=length-1;
			 for(;i>=1;i--){
				 if(c[i-1]<c[i]){
					 break;
				 }
			 }
			 if(i==0){
				 return list;
			 }
			 System.out.println("i:"+i);
			 int lastIndex=getLastIndex(c, i);
			 System.out.println("lastIndex:"+lastIndex);
			 swap(c, i-1, lastIndex);
			 reverse(c, i);
			 list.add(String.valueOf(c));
		 }
		 
	 }
}
