
public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		MyTask task = new MyTask();
		
		task.doTask();
		Thread.sleep(2000);
		System.out.println(task.getNum()); // output: num after 2 seconds.
		task.stopTask();
		System.out.println(task.getNum()); // output: num after the finished task.
		
		task.doTask(); // output: No more counting... (isOn == false).
	}

}
