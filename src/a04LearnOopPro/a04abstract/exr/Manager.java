package a04LearnOopPro.a04abstract.exr;
/*
@author YwQ
@version 1.0
*/

public class Manager extends CommonEmployee{
    private double bonus;
    public Manager(double bonus,String name,int id,double salary){
        super(name, id, salary);
        this.bonus=bonus;

    }
    @Override
    public String toString() {
        return " salary is"+this.getSalary()+"\n"+"name is "+this.getName()+"  id is "+this.getId()
                +"\t bonus is"+this.bonus;
    }


    @Override
    public void work() {
        System.out.println("salary is"+this.getSalary() +"\n"+"all my info");
    }
}
