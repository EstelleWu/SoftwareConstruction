package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class ThingCollection implements Iterable<Thing>{
    private ArrayList<Thing> things = new ArrayList<>();

    public void add(Thing thing) {
        System.out.println("Ooh --- I have a new " + thing.getName());
        things.add(thing);
    }

    public void removeThingsThatStartWith(String prefix) {
        for (Thing thing : things) {
            if (thing.getName().startsWith(prefix)) {
                things.remove(thing);
            }
        }
    }

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return things.iterator();
	}
}
