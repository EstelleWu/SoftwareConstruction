package model;

public class Animal {
    private String name;
    private String hunger;
    private String diet;
    private boolean sleeping;
    private Stall stall;

    public Animal(String name, String diet, int stallSize){
        stall = new Stall("messy",stallSize);
        this.name=name;
        hunger ="hungry";
        this.diet=diet;
    }
    public String getName() {
        return name;
    }

    public String getHunger() {
        return hunger;
    }

    public String getDiet() {
        return diet;
    }

    public boolean isSleeping() {
        return sleeping;
    }

    public Stall getStall(){
        return stall;
    }

    public String getStallStatus(){
        return stall.getStatus();
    }

    public void reset(){
        System.out.println(this.name+" is hungry and awake!");
        sleeping=false;
        hunger ="hungry";
    }
    public void feed(){
        if (diet.equals("carnivore")) {
            System.out.println(this.name + " is fed meat!");
        }
        if (diet.equals("herbivore")) {
            System.out.println(this.name + " is fed veggies!");
        }
        if (diet.equals("omnivore")) {
            System.out.println(this.name + " is fed veggies and meat!");
        }
        hunger = "fed";
    }

    public void resetStall(){
        System.out.println(this.name+" has a messy stall!");
        stall.setStatus("messy");
    }
    public void cleanStall(){
        for (int i=0; i<stall.getSquareFeet(); i++){
            System.out.print(".");
        }
        System.out.println("\n"+this.name+" has a clean stall!");
        stall.setStatus("clean");
    }

    public void putToBed() {
        System.out.println(this.name+" is being put to bed!");
        sleeping=true;
    }
}
