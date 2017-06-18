package cn.bupt.swordToOffer;

public class FindGreatestSumOfSubArray {
	
	public static void main(String[] args) {
		FindGreatestSumOfSubArray findGreatestSumOfSubArray=new FindGreatestSumOfSubArray();
		int a[]={-1,-2,-3,-4};
		System.out.println(findGreatestSumOfSubArray.FindGreatestSumOfSubArray(a));
	}
	
	public int FindGreatestSumOfSubArray(int[] array) {
		
		int sum=0,max=Integer.MIN_VALUE;
		for(int i=0;i<array.length;i++){
			sum+=array[i];
			if(sum>max)
				max=sum;
			if(sum<0)
				sum=0;
		}
		return max;
        
    }

}
