// Represents an organization that counts the number of animals at the zoo
public class Organization extends Observer{
    private int numAnimals;

    //EFFECTS: constructs organization with animal counter set to zero
    public Organization() {
        numAnimals = 0;
    }

    public int getNumberOfAnimals() {
        return numAnimals;
    }

	@Override
	public void update(String animal_name) {
		numAnimals += 1;
		System.out.println("There are now " + numAnimals + " animals at the zoo.");
		
	}
}
