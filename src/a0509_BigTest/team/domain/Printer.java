package a0509_BigTest.team.domain;
/*
@author YwQ
@version 1.0
*/

public class Printer implements Equipments {
    private String model;
    private String type;

    public Printer(String model, String Type) {
        this.model = model;
        this.type = Type;
    }

    @Override
    public String getDescription() {
        return " Type " + type + " model " + model + " .";
    }
}
