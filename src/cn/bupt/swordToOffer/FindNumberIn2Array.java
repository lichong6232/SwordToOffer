package cn.bupt.swordToOffer;

public class FindNumberIn2Array {
	
	public static void main(String[] args) {
		int array[][]={{1,2,8,9},
						{2,4,9,12},
						{4,7,10,13},
						{6,8,11,15}};
		boolean isFind=Find(7, array);
		
	}
	
	public static boolean Find(int target, int [][] array) {
		int i=0,j=array[0].length-1;
		while(i<=array.length-1&&j>=0){
			if(target==array[i][j]){
				return true;
			}else if(target<array[i][j]){
				j--;
			}else{
				i++;
			}
		}
		return false;

    }

}
