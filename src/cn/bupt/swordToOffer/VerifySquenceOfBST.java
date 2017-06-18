package cn.bupt.swordToOffer;

public class VerifySquenceOfBST {
	
	public static void main(String[] args) {
		VerifySquenceOfBST verifySquenceOfBST=new VerifySquenceOfBST();
		int sequence[]={8,6};
		System.out.println(verifySquenceOfBST.VerifySquenceOfBST(sequence));
	}
	
    public boolean VerifySquenceOfBST(int [] sequence) {
    	if(sequence==null||sequence.length==0){
    		return false;
    	}
        
    	return isSequenceOfBSF(sequence, 0, sequence.length-1);
    }
    
    public boolean isSequenceOfBSF(int sequence[],int start,int end){
    	if(start>=end)
    		return true;
    	int i=end;
    	while(i>start&&sequence[i-1]>sequence[end]){
    		i--;
    	}
    	for(int j=start;j<=i-1;j++){
    		if(sequence[j]>sequence[end]){
    			return false;
    		}
    	}
    	return isSequenceOfBSF(sequence, start+1, i-1)&&isSequenceOfBSF(sequence, i, end-1);
    	
    }

}
