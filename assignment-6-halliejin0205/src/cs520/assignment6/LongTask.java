package cs520.assignment6;

public class LongTask extends Thread {
	private SharedResults sharedData;
	private StringBuffer inputData;
	private char target;
	
	public LongTask(SharedResults sharedData, StringBuffer inputData, char target) {
		this.sharedData = sharedData;
		this.inputData = inputData;
		this.target = target; 
		Thread.currentThread().setName("Thread_<" + target + ">");
	}
	
	public void run(){
		int cot = 0;
		System.out.println("Thread Thread_" + target + " running");
			for (int i = 0; i < inputData.length(); i++) {
				if (inputData.charAt(i) == target) {
					cot++;
					
				}
			}
		ResultsEntry res = new ResultsEntry();
		res.setCount(cot);
		res.setTarget(target);
		
		sharedData.addToResults(res);
		
		
		
	}
}
