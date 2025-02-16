package test;

// 1. Eager initialization: This is the simplest method of creating a singleton class.
// In this, object of class is created when it is loaded to the memory by JVM.
// It is done by assigning the reference an instance directly.
// It can be used when program will always use instance of this class,
// or the cost of creating the instance is not too large in terms of resources and time.

//Eager Initialization
public class Singleton_1 {  
	// Public instance initialized when loading the class 
	private static final Singleton_1 instance = new Singleton_1(); 
	
	// Private CTOR.
	private Singleton_1() {	}
	
	public static Singleton_1 getInstance() {
		return instance;
	}
}

// Pros:
// 1. Very simple to implement.

// Cons:
//1. May lead to resource wastage. Because instance of class is created always, 
// 	 whether it is required or not.
//2. CPU time is also wasted in creation of instance if it is not required.
//3. Exception handling is not possible.