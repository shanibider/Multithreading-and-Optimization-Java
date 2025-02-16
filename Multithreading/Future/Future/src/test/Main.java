package test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

	public static void main(String[] args) throws Exception {
		
		ExecutorService executor = Executors.newFixedThreadPool(2);
		
		CallableWorker cw = new CallableWorker();
		Object obj = cw.call();
		System.out.println(obj.getClass()); // class test.Worker
		
		Future<Worker> fw1 = executor.submit(new CallableWorker());
		Future<Worker> fw2 = executor.submit(new CallableWorker());
		Future<Worker> fw3 = executor.submit(new CallableWorker());
		Future<Worker> fw4 = executor.submit(new CallableWorker());
		
		System.out.println(fw4.isDone()); // false.
		System.out.println(fw1.isCancelled()); // false
		
		Worker w1 = fw1.get(); // Waits for the call() to return.
		w1.id = 1;
		
		Worker w2 = fw2.get(); // Waits for the call() to return.
		w2.id = 2;
		
		Worker w3 = fw3.get(); // Waits for the call() to return.
		w3.id = 3;
		
		Worker w4 = fw4.get(); // Waits for the call() to return.
		w4.id = 4;
		
		Worker w5 = fw4.get(); // Waits for the call() to return.
		w5.id = 5;
		
		Worker w6 = fw4.get(); // Waits for the call() to return.
		w6.id = 6;
		
		System.out.println(w1.id); // 1
		System.out.println(w2.id); // 2
		System.out.println(w3.id); // 3
		System.out.println(w4.id); // 6
		System.out.println(w5.id); // 6
		System.out.println(w6.id); // 6
		
		System.out.println(fw4.isDone()); // true.
		
		executor.shutdown();
	}
}
