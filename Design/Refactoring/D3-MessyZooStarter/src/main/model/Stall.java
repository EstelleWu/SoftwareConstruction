package model;

public class Stall {

    private int squareFeet;
    private String status;

    public Stall(String status, int squareFeet){
        this.status = status;
        this.squareFeet = squareFeet;
    }
    
    public String getStatus() {
        return status;
    }

    public int getSquareFeet() {
        return squareFeet;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
