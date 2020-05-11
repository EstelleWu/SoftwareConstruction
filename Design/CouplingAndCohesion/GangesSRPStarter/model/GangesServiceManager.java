package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 * model.Customer interface for making requests of various Ganges.com, Inc. services.
 */
public class GangesServiceManager {
	private CustomerManager customer_manager;
	private BookOrderManager book_order_manager;
	private List<Book> books;
	
	public GangesServiceManager() {
		
		this.books = new ArrayList<>();
        books.add(new Book ("A Tale of Two Gentlemen of Verona", 5.99));
        books.add(new Book("Harry Potter and a Series of Unfortunate Events", 12.49));
        books.add(new Book("Fifty Shades of The Color Purple", 22.36));
        this.customer_manager = new CustomerManager();
		this.book_order_manager = new BookOrderManager(books);
        
	}
    // EFFECTS: Print all books for sale to the console, along with the index number + 1.
    public void listAvailableBooks() {
        System.out.println("Books available through Ganges:");
        for (int i = 0; i < books.size(); i++) {
            Book thisBook = books.get(i);
            System.out.println((i+1) + ". " + thisBook.getTitle() + " - " + thisBook.getPrice());
        }
    }
    
    public BookOrder orderBook(Customer c, int bookNumber) {
    	return this.book_order_manager.orderBook(c, bookNumber);
    }
	
    public boolean cancelBookOrder(int orderNumber) {
    	return this.book_order_manager.cancelBookOrder(orderNumber);
    }
    
    public Customer signUpNewCustomer(String address, String name) {
    	return this.customer_manager.signUpNewCustomer(address, name);
    }
    
    public void putData(Customer c, String data) {
    	this.customer_manager.putData(c, data);
    }
    
    public String getData(Customer c) {
    	return this.customer_manager.getData(c);
    }

    public String deleteData(Customer c) {
    	return this.customer_manager.deleteData(c);
    }
}
