package model;

import java.util.ArrayList;
import java.util.List;

public abstract class FOHEmployee {
	// private List<Order> orders;
	protected Dish dish;
	public FOHEmployee(Dish dish) {
		// this.orders = new ArrayList<>();
        // currentOrderNumber = 100;
        this.dish = dish;
	}
	
	
	//EFFECTS: prints out a description of the dish on the menu
    public void describeDish() {
        System.out.println(getShortPrefix() + dish.getDescription());
    }
    
    abstract String getShortPrefix();
    //EFFECTS: prints out a greeting
    public void greet() {
        System.out.println(getShortPrefix() + "\"Hello and welcome to Busy's, the home of the trendy turkey club sandwich.\"");
    }
	
	abstract double getCash();
	
	abstract public List<Order> getActiveOrders();
	
	abstract public Order takeOrder();
	
	abstract public void takePayment(Order order);
	
	abstract public String getPrefix();
	
	public void deliverFood(Order order) {
		order.setIsServed();
        System.out.print(getPrefix() + "Delivered food: ");
        order.print();
	}
}
