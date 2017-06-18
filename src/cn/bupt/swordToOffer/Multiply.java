package cn.bupt.swordToOffer;

public class Multiply {
	
	public int[] multiply(int[] A) {
		if(A==null||A.length==0)
			return A;
		int b[]=new int[A.length];
		b[0]=1;
		for(int i=1;i<A.length;i++){
			b[i]=b[i-1]*A[i-1];
		}
		int temp=1;
		for(int j=A.length-2;j>=0;j--){
			temp*=A[j+1];
			b[j]*=temp;
		}
		return b;

    }

}
