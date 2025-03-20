package main;
import java.util.ArrayList;

import restaurant.Restaurant;

public class Order {
	private Chef chef;
	private Visitor visitor;
	private Food food;
	private int quantity;

	public Order(Chef chef, Visitor visitor, Food food, int quantity) {
		this.chef = chef;
		this.visitor = visitor;
		this.food = food;
		this.quantity = quantity;
	}
	
	public int getOrderPrice() {
		return food.getPrice() * quantity;
	}
	
}
