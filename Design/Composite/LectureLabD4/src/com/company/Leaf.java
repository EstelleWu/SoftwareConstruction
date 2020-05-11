package com.company;

public class Leaf extends Offshoot {

    boolean color; //false is green and true is red
    
    public Leaf(String name) {
    	super(name);
    }
    @Override
    public void changeColor() {
        color = !color;
    }
}