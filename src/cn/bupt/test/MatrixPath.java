package cn.bupt.test;

public class MatrixPath {
	private boolean tag[]=null;
	
	public static void main(String[] args) {
		char matrix[]={'a','b','c','e','s','f','c','s','a','d','e','e'};
		int rows=3,cols=4;
		char []str={'a','b','c','b'};
		MatrixPath matrixPath=new MatrixPath();
		System.out.println(matrixPath.hasPath(matrix, rows, cols, str));
	}
	public boolean hasPath(char[] matrix, int rows, int cols, char[] str){
		tag=new boolean[rows*cols];
		return path(matrix, rows, cols, str, 0, 0, 0);
    }
	public boolean path(char matrix[],int rows,int cols,char str[],int k,int i,int j){
		int index=i*cols+j;
		if(i>=rows||i<0 || j>=cols ||j<0 || matrix[index]!=str[k] || tag[index])
			return false;
		if(k==str.length-1)
			return true;
			
		tag[index]=true;
		boolean isPath= path(matrix, rows, cols, str, k, i+1, j)
				|| path(matrix, rows, cols, str, k, i-1, j)
				|| path(matrix, rows, cols, str, k, i, j+1)
				|| path(matrix, rows, cols, str, k, i, j-1);
		tag[index]=false;
		return isPath;
		
	}

}
