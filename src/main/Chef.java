package main;
import java.util.ArrayList;

public class Chef {
	private String name;
	private ArrayList<String> listHistory = new ArrayList<String>();
	
	
	public Chef(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setHistory(String history) {
		listHistory.add(history);
	}

	public void showCookHistory() {
		System.out.println();
		System.out.println("---- " + name + " COOK HISTORY ----");
		for (String history : listHistory) {
			System.out.println(" - " + history);
		}
	}
}
