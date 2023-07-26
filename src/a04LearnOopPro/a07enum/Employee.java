package a04LearnOopPro.a07enum;
/*
@author YwQ
@version 1.0
*/

public class Employee {
    private String name;
    private int age;
    private Status status;


    public static void main(String[] args) {
        Employee e1 = new Employee(  "Tom", 21,Status.BUSY);
        //打印的时候调用了tostring,打印粗来信息和状态(因为装填就几种,所以可以用枚举类)
        System.out.println(e1);
    }
    public Employee(String name, int age, Status status) {
        this.name = name;
        this.age = age;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name=" + name +
                ", age=" + age +
                ", status=" + status +
                '}';
    }


}
