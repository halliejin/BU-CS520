package cs520.assignment6;

import java.util.ArrayList;
import java.util.Collection;

public class SharedResults {
	
	private Collection<ResultsEntry> results = null;
	
	public SharedResults() {
		results = new ArrayList<ResultsEntry>();	
	}
	
	public synchronized void addToResults(ResultsEntry res) {
		results.add(res);
		System.out.println("Thread_" + res.getTarget() +  " is adding <" + res.getTarget() + ", " + res.getCount() + ">");
		System.out.println("  Cumulative Results are " + results.toString() );
	}
	
	public synchronized int getResult() {
		int sum = 0;
		for (ResultsEntry i: results) {
			sum += i.getCount();
	
		}
		return sum;
		
	}

	
}

