package com.company;

public class RealEstate extends Property {

    private String type;
    private boolean commercial;

    public RealEstate(String owner, double value, int size, String type, boolean commercial) {
        super(owner, value, size);
        this.type = type;
        this.commercial = commercial;
    }

    public void setType(String type) {
        this.type = type;
        System.out.println("This property is a " + type);
    }

    public void setCommercial(boolean commercial) {
        this.commercial = commercial;
        if (commercial) {
            System.out.println("This property is commercial");
        }else {
            System.out.println("This property is not commercial");
        }
    }


}
