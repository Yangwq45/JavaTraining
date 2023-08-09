package a0509_BigTest.team.domain;
/*
@author YwQ
@version 1.0
*/

import a04LearnOopPro.a07enum.Status;

public class Programmer extends Employee{
    private int memberId;//开发团队的tid
    //自己定义一个enum
    Status status =Status.FREE;
    //只是声明,后面再创建
    Equipments equipments;

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Equipments getEquipments() {
        return equipments;
    }

    public void setEquipments(Equipments equipments) {
        this.equipments = equipments;
    }

    public Programmer(int id, String name, int age, double salary, int memberId, Status status, Equipments equipments) {
        super(id, name, age, salary);
        this.memberId = memberId;
        this.status = status;
        this.equipments = equipments;
    }
}
