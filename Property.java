package com.company;

public class Property {

    private String owner;
    private double value;
    private int size;



    public Property(String owner, double value, int size) {
        this.owner = owner;
        this.value = value;
        this.size = size;
    }

    public void setOwner(String owner) {
        this.owner = owner;
        System.out.println("Property.setOwner() is called");
    }

    public void setValue(double value) {
        this.value = value;
        System.out.println("Property.setValue() is called");
    }

    public void setSize(int size) {
        this.size = size;
        System.out.println("property.setSize() is called");
        System.out.println("Property size is " + size );
    }




    public  void sold ( String newOwner, double sellPrice) {

            this.owner = newOwner;
            System.out.println("New owner is " + newOwner);


        if (sellPrice > value) {
            System.out.println("the value of the property increased by" + (sellPrice - value));
        }
        else if (sellPrice == value) {
            System.out.println("the value of the property has not changed");
        } else {
            System.out.println("the value of the property decreased by " + (value - sellPrice));
        }


    }
}
