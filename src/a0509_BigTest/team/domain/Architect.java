package a0509_BigTest.team.domain;
/*
@author YwQ
@version 1.0
*/

import a04LearnOopPro.a07enum.Status;

public class Architect extends Programmer{
    private int stock;

    public Architect(int id, String name, int age, double salary, int memberId, Status status, Equipments equipments, int stock) {
        super(id, name, age, salary, memberId, status, equipments);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
