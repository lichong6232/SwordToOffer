package cn.bupt.swordToOffer;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.CountDownLatch;

public class SudokuSolver {
	
	private char[][]matrix;
	private char [][]result;
	
	public  void out(){
		for(int i=0;i<this.matrix.length;i++){
			for(int j=0;j<this.matrix[i].length;j++){
				System.out.print(this.matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		char [][]board={{'.','.','9','7','4','8','.','.','.'},
						{'7','.','.','.','.','.','.','.','.'},
						{'.','2','.','1','.','9','.','.','.'},
				       {'.','.','7','.','.','.','2','4','.'},
				       {'.','6','4','.','1','.','5','9','.'},
				       {'.','9','8','.','.','.','3','.','.'},
				       {'.','.','.','8','.','3','.','2','.'},
				       {'.','.','.','.','.','.','.','.','6'},
				       {'.','.','.','2','7','5','9','.','.'}};
		
		SudokuSolver sudokuSolver=new SudokuSolver();
		sudokuSolver.solveSudoku(board);
		
		for(int i=0;i<board.length;i++){
			for(int j=0;j<board[i].length;j++){
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	 public void solveSudoku(char[][] board) {
	        this.matrix=board;
	        result=new char[this.matrix.length][this.matrix.length];
	        backTrace(0, 0);
	        for(int i=0;i<board.length;i++){
				for(int j=0;j<board[i].length;j++){
					board[i][j]=result[i][j];
				}
				
			}
	 }
	 
	 public void copyMatrix(){
		
		 for(int i=0;i<result.length;i++){
			 for(int j=0;j<result[i].length;j++){
				 result[i][j]=this.matrix[i][j];
			 }
		 }
		 
		
	 }
	
	public  void backTrace(int row,int col){
		
		if(row==8&&col==9){
			copyMatrix();
			return;
		}
		if(col==9){
			row++;
			col=0;
		}
	
		
		if(matrix[row][col]=='.'){
			for(char c='1';c<='9';c++){
				if(check(row, col, c)){
					matrix[row][col]=c;
					backTrace(row, col+1);
					matrix[row][col]='.';
					
				}
			}
		}else{
			backTrace(row, col+1);
		}
	}
	
	public  boolean check(int row,int col,char number){
		for(int i=0;i<9;i++){
			if(matrix[row][i]==number||matrix[i][col]==number)
				return false;
			
		}
		
		int gradeRow=row/3,gradeCol=col/3;
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				if(matrix[i+3*gradeRow][j+3*gradeCol]==number)
					return false;
			}
		}
		
		return true;
		
	}	

}
