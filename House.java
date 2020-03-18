package com.company;

public class House extends RealEstate {

    private int room;
    private int bathroom;
    private boolean garden;

    public House( ) {
        super("Fethi", 0.0, 100, "flat", false);
        this.room = 0;
        this.bathroom = 0;
        this.garden = false;
    }

    public void setRoom(int room) {
        this.room = room;
        System.out.println("The house has " + room + " rooms");
    }

    public void setBathroom(int bathroom) {
        this.bathroom = bathroom;
        System.out.println("The house has " + bathroom + " bathrooms");
    }

    public void setGarden(boolean garden) {
        this.garden = garden;
        System.out.println("The house has a garden");
    }



}
