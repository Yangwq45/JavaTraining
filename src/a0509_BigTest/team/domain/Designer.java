package a0509_BigTest.team.domain;
/*
@author YwQ
@version 1.0
*/

import a04LearnOopPro.a07enum.Status;

public class Designer extends Programmer{
    private double bonus;

    public Designer(int id, String name, int age, double salary, int memberId, Status status, Equipments equipments, double bonus) {
        super(id, name, age, salary, memberId, status, equipments);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
