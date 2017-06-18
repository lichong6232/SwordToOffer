package cn.bupt.swordToOffer;

import java.util.ArrayList;

public class PrintMatrix {
	
	public static void main(String[] args) {
		int matrix[][]={{1,2,3},{4,5,6}};
		PrintMatrix printMatrix=new PrintMatrix();
		ArrayList<Integer> list=printMatrix.printMatrix(matrix);
		System.out.println(list);
	}
	
	public ArrayList<Integer> printMatrix(int [][] matrix) {
	       int row=matrix.length;
	       int col=matrix[0].length;
	       int cir=Math.min(row/2+row%2, col/2+col%2);
	       ArrayList<Integer> list=new ArrayList<Integer>();
	       for(int i=0;i<cir;i++){
	    	   for(int j=i;j<col-i;j++){
	    		   list.add(matrix[i][j]);
	    	   }
	    	   for(int j=i+1;j<row-i;j++){
	    		   list.add(matrix[j][col-i-1]);
	    	   }
	    	   for(int j=col-i-2;j>=i&&row-i-1!=i;j--){
	    		   list.add(matrix[row-i-1][j]);
	    	   }
	    	   for(int j=row-i-2;j>i&&col-i-1!=i;j--){
	    		   list.add(matrix[j][i]);
	    	   }
	       }
	       
	       return list;
    }

}
