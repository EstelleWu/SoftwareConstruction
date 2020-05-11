package starter;

import java.util.ArrayList;
import java.util.Observer;

public class Leaf extends Offshoot {

    private boolean isGreen = true;

    // EFFECTS: constructs leaf with given name and observer, and color set to green
    public Leaf(String name, Observer leafMonitor) {
        super(name);

        addObserver(leafMonitor);
    }

    @Override
    // MODIFIES: this
    // EFFECTS: changes color of leaf from green to red or vice versa
    public void changeColor() {
        this.isGreen = !isGreen;
        System.out.println(getName() + " says: I AM CHANGING TO: " + getColour());
        setChanged();
        notifyObservers();
    }

    // EFFECTS: returns color of leaf
    public String getColour() {
        if (isGreen) return "green";
        return "red";
    }
}
