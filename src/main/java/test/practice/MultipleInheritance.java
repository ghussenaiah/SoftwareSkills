package test.practice;



class A{  
void msg(){System.out.println("Hello");}  
}  
class B{  
void msg1(){System.out.println("Welcome");}  
}  
public class MultipleInheritance extends A{ 
   
 public static void main(String args[]){  
	 MultipleInheritance obj=new MultipleInheritance();  
   obj.msg();//Now which msg() method would be invoked?  
} 
 
}

