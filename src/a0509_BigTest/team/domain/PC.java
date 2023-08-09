package a0509_BigTest.team.domain;
/*
@author YwQ
@version 1.0
*/

public class PC implements Equipments {
    private String model;
    private double PRICE;

    public PC(String model, double PRICE) {
        this.model = model;
        this.PRICE = PRICE;
    }

    @Override
    public String getDescription() {
        return " model " + model + " price " + PRICE + " .";
    }
}
