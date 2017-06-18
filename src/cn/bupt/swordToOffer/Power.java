package cn.bupt.swordToOffer;

public class Power {
	
	public static void main(String[] args) {
		Power power=new Power();
		System.out.println(power.power(2.0, 0));
	}
	
	 public double power(double base, int exponent) {
		 double res=1.0;
		 int p=exponent>0?exponent:-exponent;
		 
		 while(p>0){
			 if((p&1)==1)
				 res*=base;
			 base*=base;
			 p>>=1;
			 
		 }
		 
		 return exponent>0?res:(1/res);
	        
	  }

}
