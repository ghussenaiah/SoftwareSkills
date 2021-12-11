package test.java8.features;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.util.StopWatch;

public class ParallelThreads {

	public static void main(String args[]) {

		StopWatch watch = new StopWatch();
		watch.start();
		// test();

		for (int i = 0; i < 1000; i++) {
			System.out.println("thread 1 is executing");
		}
		;
		for (int j = 0; j < 1000; j++) {
			System.out.println("thread 2 is executing");
		}
		;

		watch.stop();
		System.out.println("total time need to execute this is " + watch.getTotalTimeMillis());

		ExecutorService executor = Executors.newFixedThreadPool(10);
		executor.submit(() -> {
			String threadName = Thread.currentThread().getName();
			System.out.println("Hello " + threadName);
		});
		executor.submit(() -> {
			String threadName = Thread.currentThread().getName();
			System.out.println("Hello " + threadName);
		});
		executor.submit(() -> {
			String threadName = Thread.currentThread().getName();
			System.out.println("Hello " + threadName);
		});

	}

	static void test() {

		new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				System.out.println("thread 1 is executing");
			}
			;

		}).start();

		new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				System.out.println("thread 2 is executing");
			}
			;

		}).start();
	}

	/*
	 * new Thread(() -> { for(int i=0;i<100;i+=) {
	 * System.out.println("thread 1 is executing"); } }).start();
	 * 
	 * new Thread(() -> { for(int j=0;j<100;j+=) {
	 * System.out.println("thread 2 is executing"); } }).start();
	 */

}
