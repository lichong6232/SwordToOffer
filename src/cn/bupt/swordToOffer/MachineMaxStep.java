package cn.bupt.swordToOffer;

public class MachineMaxStep {
	
	
	public static void main(String[] args) {
		MachineMaxStep machineMaxStep=new MachineMaxStep();
		System.out.println(machineMaxStep.movingCount(15, 100, 1));
	}
	
	public  int movingCount(int threshold, int rows, int cols){
		int maxStep[]=new int[1];
		boolean tag[]=new boolean[rows*cols];
		move(0, 0, rows, cols, threshold, maxStep,tag);
        return maxStep[0];
    }
	
	public  void move(int i,int j,int rows,int cols,int threshold,int maxStep[],boolean tag[]){
		int index=i*cols+j;
		if(i<0||i>=rows||j<0||j>=cols||(i/10+i%10+j/10+j%10)>threshold||tag[index]){
			return;
		}
		++maxStep[0];
		tag[index]=true;
		move(i+1, j, rows, cols, threshold, maxStep,tag);
		move(i-1, j, rows, cols, threshold, maxStep,tag);
		move(i, j+1, rows, cols, threshold, maxStep,tag);
		move(i, j-1, rows, cols, threshold, maxStep,tag);
	}

}
