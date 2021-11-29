package test.java8.features;

/*class MyRunnable implements Runnable {
     
     public void run() {
		
		 for(int i=1;i<=10;i++){  
		        System.out.println("child thread ->"+i);  
		    }  
}*/
 
public class LamdaExpressionWithThreading {

	public static void main(String args[]) {

		// MyRunnable lt=new MyRunnable();
		Runnable lt = () -> {
			for (int i = 1; i <= 10; i++) {
				System.out.println("child thread ->" + i);
			}
		};
		Thread t = new Thread(lt);
		t.start();

		for (int i = 1; i <= 10; i++) {

			System.out.println("main thread -> " + i);
		}
	}
}


/*Runnable interface bydefaul haivng only one abstract method ...that we can convert to *lamda expression*
remvoing extended class name and using directly funtional interface name 
Runnable lt in the above program*/