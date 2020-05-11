package model;

public abstract class Book {
	private String title;   // all private fields??? not protected???
    private double price;
    private Box box;
    
    public Book(String title, double price) {
        this.title = title;
        this.price = price;
        this.box = null; // book starts off unpackaged
    }
    
    abstract public Box packageBook(Box b);
    
    public void setBox(Box box) {
        this.box = box;
    }
    
    public String getTitle() {
        return title;
    }
    
    abstract public double calculateShipping();
    
    abstract public String getMinBoxSize();
}
