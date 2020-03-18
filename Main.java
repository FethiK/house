package com.company;

public class Main {

    public static void main(String[] args) {


        House house = new House();
        house.setOwner("Fethi");
        house.setValue(100.000);
        house.setSize(100);

        house.sold("Remzi", 120.000);
        house.setSize(110);


        house.setGarden(true);
        house.setSize(150);
        house.setType("house");
        house.setBathroom(4);
        house.setCommercial(false);
        house.sold("Usame", 150.000);






    }
}
