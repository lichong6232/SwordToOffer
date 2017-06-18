package cn.bupt.swordToOffer;


public class FindNumsAppearOnce {
	
	
	public static void main(String[] args) {
		int array[]={2,2,3,3,4,4,6,6,7,1};
		FindNumsAppearOnce findNumsAppearOnce=new FindNumsAppearOnce();
		int num1[]=new int[1];
		int num2[]=new int[1];
		
		findNumsAppearOnce.findNumsAppearOnce1(array, num1, num2);
		System.out.println(num1[0]);
		System.out.println(num2[0]);
		
		
	}
	
	 public void findNumsAppearOnce(int [] array,int num1[] , int num2[]) {
		 int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
		 for(int i=0;i<array.length;i++){
			 int temp=array[i];
			 if(temp>max){
				 max=temp;
			 }
			 if(temp<min){
				 min=temp;
			 }
		 }
		 
		 int c[]=new int[max-min+1];
		 for(int i=0;i<array.length;i++){
			 ++c[array[i]-min];
		 }
		 int inde=0;
		 int find[]=new int[2];
		 for(int i=0;i<c.length;i++){
			 if(c[i]==1){
				 find[inde++]=i+min;
			 }
		 }
		 num1[0]=find[0];
		 num2[0]=find[1];
	        
	 }
	 //���ַ��������������ֳ���ż�������ã����ȶ�����������������㣬
	 //��һ����Ҫ��Ҫ�ҵ�������Ķ������д�������ĵ�һ��1��λ�ã������ó������ֵ
	 //���������ֵ�������е�ÿ������������������������е����ݽ�������
	 public void findNumsAppearOnce1(int [] array,int num1[] , int num2[]) {
		 int temp=0;
		 for(int number:array)
			 temp^=number;
		 int i=1;
		 while((temp&i)==0)
			 i<<=1;
		 for(int number:array){
			 if((number&i)==0)
				 num1[0]^=number;
			 else
				 num2[0]^=number;
		 }
		 
	 }

}
