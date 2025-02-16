package test_2;

public class MainWithSynchronized {

    public static void main(String[] args) 
    { 
        Line_2 obj = new Line_2(); 
  
        // we are creating two threads which share 
        // same Object. 
        Train_2 train1 = new Train_2(obj); 
        Train_2 train2 = new Train_2(obj); 
  
        // both threads start executing . 
        train1.start(); 
        train2.start(); 
        
        // output:
        // 0
        // 1
        // 2
        // 0
        // 1
        // 2
    }
}
