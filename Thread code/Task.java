package test;

import java.util.Date; 
import java.text.SimpleDateFormat;  

//Task class to be executed
public class Task implements Runnable{
	// Data members:
	private String name;
	
	// CTOR.
	public Task(String otherName) {
		this.name = otherName;
	}
	
    // Prints task name and sleeps for 1s 
    // This Whole process is repeated 5 times
	@Override
	public void run() {
		try {
			for(int i = 0; i < 5; i++) {
				Date date = new Date();
				SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss");
				if(i == 0) {				
					// Prints the initialization time for every task. 
					System.out.println("Initialization Time for"
                            + " task name - " + name + " = " + format.format(date));
			}
				else {	
					// Prints the execution time for every task.
                    System.out.println((i) + ". Executing Time for task name - " + 
                            name +" = " + format.format(date)); 
					
					}
				Thread.sleep(1000);
				}
			System.out.println(name + " complete");
		} catch (InterruptedException e) { e.printStackTrace(); }	
	}
}
