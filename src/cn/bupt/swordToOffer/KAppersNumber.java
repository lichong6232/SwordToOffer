package cn.bupt.swordToOffer;

public class KAppersNumber {
	
	public static void main(String[] args) {
		KAppersNumber kAppersNumber=new KAppersNumber();
		int a[]={1,2,3,3,3,3,4,5};
		System.out.println(kAppersNumber.GetNumberOfK(a, 3));
	}
	
	 public int GetNumberOfK(int [] array , int k) {
		 
		 if(array==null || array.length==0)
			 return 0;
	       int left=0,right=array.length-1;
	       int kIndex=-1;
	       while(left<=right){
	    	   int mid=(left+right)/2;
	    	   if(array[mid]==k){
	    		   kIndex=mid;
	    		   break;
	    	   }else if(k<array[mid]){
	    		   right=mid-1;
	    	   }else{
	    		   left=mid+1;
	    	   }
	       }
	       System.out.println(kIndex);
	       if(kIndex!=-1){
	    	   int kNumber=1;
	    	   int i=kIndex+1;
	    	   while(i<array.length&&array[i]==k){
	    		   kNumber++;
	    		   i++;
	    	   }
	    	   int j=kIndex-1;
	    	   while(j>=0&&array[j]==k){
	    		   kNumber++;
	    		   j--;
	    	   }
	    	   
	    	   return kNumber;
	       }
	       
	       return 0;
	       
	 }

}
