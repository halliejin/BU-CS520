package cs520.assignment6;

public class ResultsEntry {
	private int count;
	private char target;
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public char getTarget() {
		return target;
	}
	public void setTarget(char target) {
		this.target = target;
	}
	
	public String toString() {
		return "<" + target + ", " + count + ">";
	}
	
}
