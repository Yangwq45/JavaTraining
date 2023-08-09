package a0509_BigTest.team.domain;
/*
@author YwQ
@version 1.0
*/

public class Notebook implements Equipments {
    private String model;
    private double PRICE;

    public Notebook(String model, double PRICE) {
        this.model = model;
        this.PRICE = PRICE;
    }

    @Override
    public String getDescription() {
        return " PRICE " + PRICE + " model " + model + " .";
    }


}
