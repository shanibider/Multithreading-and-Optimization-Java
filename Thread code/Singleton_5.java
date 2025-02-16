package test;

// 5. Lazy initialization with Double check locking: In this mechanism, 
// we overcome the overhead problem of synchronized code.
// In this method, getInstance is not synchronized but the block 
// which creates instance is synchronized so that minimum number of
// threads have to wait and that�s only for first time.

// Lazy initialization with Double check locking
public class Singleton_5 {
	// Private instance, so that it can be 
	// accessed by only by getInstance() method
	private static Singleton_5 instance;
	
	// Private CTOR.
	private Singleton_5() {	}
	
	public static Singleton_5 getInstance() {
		if(instance == null) {
			// Synchronized block to remove overhead 
			synchronized (Singleton_5.class) {
				if(instance == null) {
					// if instance is null, initialize 
					instance = new Singleton_5();
				}
			}
		}
		
		return instance;
	}
}

// Pros:
// 1. Lazy initialization is possible.
// 2. It is also thread safe.
// 3. Performance overhead gets reduced because of synchronized keyword.

// Cons:
// 1. First time, it can affect performance.

