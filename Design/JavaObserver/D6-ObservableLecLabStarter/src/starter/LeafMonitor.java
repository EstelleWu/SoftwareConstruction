package starter;

import java.util.Observable;
import java.util.Observer;

public class LeafMonitor implements Observer {

    private String name;

    public LeafMonitor(String name){
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        Leaf leaf = (Leaf)o;
        System.out.println(name+" says "+leaf.getName()+" changed color to..."+leaf.getColour());
    }
}
