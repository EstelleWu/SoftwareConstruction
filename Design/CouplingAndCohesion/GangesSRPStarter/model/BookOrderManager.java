package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookOrderManager {
	private static final int FIRST_ORDER_NUMBER = 1000;
    private List<BookOrder> customerBookOrders;
    private int orderNumberCounter;
    private List<Book> books;
    
    public BookOrderManager(List<Book> books) {
    	this.books = books;
        this.customerBookOrders = new ArrayList<>();
        this.orderNumberCounter = FIRST_ORDER_NUMBER;
    }
    

    
    
    
	// REQUIRES: bookNumber is >= 1
    // MODIFIES: this
    // EFFECTS: If the book number corresponds to a book in stock (i.e., is a valid index+1 of the list books),
    //          then create a new model.BookOrder and return the order number; otherwise, do not create an order and return -1.
    public BookOrder orderBook(Customer c, int bookNumber) {
        bookNumber--; // change book number to zero-point indexing

        if (bookNumber < books.size()) {
            Book thisBook = books.get(bookNumber);
            int thisOrderNum = orderNumberCounter++;

            BookOrder order = new BookOrder(c, thisBook, thisOrderNum);
            customerBookOrders.add(order);

            System.out.println("Your order for " + thisBook.getTitle() + " is on the way!");
            return order;
        }
        else {
            System.out.println("Sorry, that isn't a book we have in stock.");
            return null;
        }
    }
    
    // MODIFIES: this
    // EFFECTS: if this order number matches a current order, then the order is cancelled (removed from the orders list)
    public boolean cancelBookOrder(int orderNumber) {
        Iterator<BookOrder> iterator = customerBookOrders.iterator();
        BookOrder currOrder;

        while (iterator.hasNext()) {
            currOrder = iterator.next();

            if (currOrder.getOrderNumber() == orderNumber) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }
    
}
