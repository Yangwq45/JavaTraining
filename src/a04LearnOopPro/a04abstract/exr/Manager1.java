package a04LearnOopPro.a04abstract.exr;
/*
@author YwQ
@version 1.0
*/

public class Manager1 extends Employee{
    private int workexp;

    public int getWorkexp() {
        return workexp;
    }

    public void setWorkexp(int workexp) {
        this.workexp = workexp;
    }

    public Manager1 (String name, int age,int workexp){
        super(name,age);
        this.workexp=workexp;
    }

    @Override
    public void work() {
        System.out.println("aaaa");
    }

    @Override
    public double calMoney(int days ) {
        if (days<=60) return days*500;
        else return (days-60)*700+60*500;
    }
}

