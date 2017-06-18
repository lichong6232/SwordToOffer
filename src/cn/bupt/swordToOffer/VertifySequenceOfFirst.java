package cn.bupt.swordToOffer;

public class VertifySequenceOfFirst {
	
	public static boolean judge(int sequence[],int start,int end){
		if(start>=end)
			return true;
		int i=start;
		while(i<end&&sequence[i+1]<sequence[start]){
			++i;
		}
		for(int j=i+1;j<=end;j++){
			if(sequence[j]<sequence[start]){
				return false;
			}
		}
		return judge(sequence, start+1, i)&&judge(sequence, i+1, end-1);
	}

}
