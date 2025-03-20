package restaurant;
import java.util.ArrayList;

import main.Chef;
import main.Food;
import main.Menu;
import main.Order;
import main.Visitor;

public class Restaurant {
	private String name;
	private ArrayList<Menu> listMenu = new ArrayList<Menu>();
	private ArrayList<Chef> listChef = new ArrayList<Chef>();
	private ArrayList<Order> listOrder = new ArrayList<Order>();
	private int totalIncome = 0;
	
	public Restaurant(String name) {
		this.name = name;
	}
	
	public void addMenu(Menu menu) {
		listMenu.add(menu);
	}
	
	public void addChef(Chef chef) {
		listChef.add(chef);
	}
	
	public ArrayList<Menu> getListMenu(){
		return listMenu;
	}

	public void order(Chef chef, Visitor visitor, String name, int quantity) {
		for (Menu menu: listMenu) {
			for (Food food : menu.getListFood()) {
				if (food.getName().equals(name)) {
					Order tempOrder = new Order(chef, visitor, food, quantity);
					listOrder.add(tempOrder);
					visitor.addTotalPrice(tempOrder.getOrderPrice());
					totalIncome += tempOrder.getOrderPrice();
					chef.setHistory(name);
				}
			}
		}
	}
	
	public void showMenu() {
		System.out.println("---- MENU ----");
		
		for (Menu menu : listMenu) {
			System.out.println("- " + menu.getTypeMenu());
			for (Food food : menu.getListFood()) {
				System.out.println("  " + food.getName() + ": " + food.getPrice());
			}
			System.out.println();
		}
		
		System.out.println();
	}
	
	public void showChef() {
		System.out.println("---- CHEF ----");
		
		for (Chef chef : listChef) {
			System.out.println("- Chef " + chef.getName());
		}
	}

	public void showTotalIncome() {
		System.out.println();
		System.out.println("---- TOTAL INCOME ----");
		System.out.println(totalIncome);
	}

	
	
	
	
}
