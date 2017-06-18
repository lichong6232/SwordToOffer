package cn.bupt.swordToOffer;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetKminNumber {
	
	public static void main(String[] args) {
		GetKminNumber getKminNumber=new GetKminNumber();
		int input[]={4,5,1,6,2,7,3,8};
		int k=9;
		List<Integer> list=getKminNumber.GetLeastNumbers_Solution(input, k);
		System.out.println(list);
	}
	
	public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
		if(k<1||k>input.length){
			return new ArrayList<Integer>();
		}
		
		int kThMinNumber=getKthNumber(input, k);
		Integer res[]=new Integer[k];
		int index=0;
		for(int i=0;i<input.length;i++){
			if(input[i]<kThMinNumber){
				res[index++]=input[i];
			}
		}
		while(index<k){
			res[index++]=kThMinNumber;
		}
		ArrayList<Integer> list=new ArrayList<Integer>(Arrays.asList(res));
		
		return list;
	        
	}
	
	public int getKthNumber(int input[],int k){
		int copyArray[]=copyArray(input);
		return selection(input, 0, copyArray.length-1, k-1);
	}
	
	 public int[] copyArray(int[] arr) {
	        int[] res = new int[arr.length];
	        for (int i = 0; i != res.length; i++) {
	            res[i] = arr[i];
	        }
	        return res;
	    }
	
	public int selection(int input[],int start,int end,int k){
		if(start==end){
			return input[start];
		}
		int pivot=getMedianOfMedian(input, start, end);
		int partition[]=partition(input,start,end,pivot);
		if(k>=partition[0]&&k<=partition[1]){
			return input[k];
		}else if(k<partition[0]){
			return selection(input, start, partition[0]-1, k);
		}else{
			return selection(input, partition[1]+1, end, k);
		}
		
		
	
	}
	
	public int[] partition(int[] arr, int begin, int end, int pivotValue) {
        int small = begin - 1;
        int cur = begin;
        int big = end + 1;
        while (cur != big) {
            if (arr[cur] < pivotValue) {
                swap(arr, ++small, cur++);
            } else if (arr[cur] > pivotValue) {
                swap(arr, cur, --big);
            } else {
                cur++;
            }
        }
        int[] range = new int[2];
        range[0] = small + 1;
        range[1] = big - 1;
        return range;
    }
	
	public int getMedianOfMedian(int input[],int start,int end){
		int sum=end-start+1;
		int mArrayLength=sum/5+(sum%5==0?0:1);
		int mArray[]=new int[mArrayLength];
		for(int i=0;i<mArrayLength;i++){
			int startI=start+i*5;
			int endI=startI+4;
			
			mArray[i]=getMedian(input, startI, Math.min(endI, end));
		}
		return getMedian(mArray, 0, mArrayLength-1);
	}
	
	public int getMedian(int input[],int start,int end){
		insertSort(input, start, end);
		int mid=(start+end)/2+(start+end)%2;
		return input[mid];
	}
	
	public void swap(int input[],int start,int end){
		if(start!=end){
			input[start]=input[start]^input[end];
			input[end]=input[start]^input[end];
			input[start]=input[start]^input[end];
		}
	}
	
	public void insertSort(int input[],int start,int end){
		for(int i=start+1;i<=end;i++){
			int temp=input[i];
			int j=i-1;
			while(j>=0&&input[j]>temp){
				input[j+1]=input[j];
				j--;
			}
			input[j+1]=temp;
		}
	}
	
	
	

}
