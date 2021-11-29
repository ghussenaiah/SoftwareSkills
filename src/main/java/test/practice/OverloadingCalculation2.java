package test.practice;


class OverloadingCalculation2{  
	 public int sum(int a,int b){System.out.println("int arg method invoked");
	return a+b;}  
	 public double  sum(double a,double b){System.out.println("long arg method invoked");
	return a+b;}  
	  
	  public static void main(String args[]){  
	  OverloadingCalculation2 obj=new OverloadingCalculation2();  
	  ;//now int arg sum() method gets invoked 
	  System.out.println(""+obj.sum(20.9,20.8));
	  }  
	}  
