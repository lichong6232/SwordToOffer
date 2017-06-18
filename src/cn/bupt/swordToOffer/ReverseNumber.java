package cn.bupt.swordToOffer;

public class ReverseNumber {
	long number=0;
	public int InversePairs(int [] array) {
		if(array==null||array.length==0)
			return 0;
		
		
		mergeSort(array,0,array.length-1);
		return (int)number%1000000007;
    }
	
	public void mergeSort(int a[],int left,int right){
		if(left<right){
			int mid=(left+right)/2;
			mergeSort(a, left, mid);
			mergeSort(a, mid+1, right);
			merge(a, left, mid, right);
		}
		
	}
	public void merge(int a[],int left,int mid,int right){
		int temp[]=new int[right-left+1];
		int i=left,j=mid+1,pos=0;
		while(i<=mid&&j<=right){
			if(a[i]<=a[j]){
				temp[pos++]=a[i++];
			}else{
				temp[pos++]=a[j++];
				number+=mid-i+1;
				if(number>1000000007){
					number%=1000000007;
				}
			}
		}
		while(i<=mid){
			temp[pos++]=a[i++];
		}
		while(j<=right){
			temp[pos++]=a[j++];
		}
		
		int start=0;
		while(left<=right){
			a[left++]=temp[start++];
		}
		
	}

}
