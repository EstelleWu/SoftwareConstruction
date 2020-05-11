// Represents an email subscriber to the zoo
public class EmailSubscriber extends Observer{
    private String name;

    // EFFECTS: constructs an email subscriber with name
    public EmailSubscriber(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


	public void update(String animal_name) {
		System.out.println(getName() + "says: Great to hear that " + animal_name + " was added to the zoo!");
		
	}
}
