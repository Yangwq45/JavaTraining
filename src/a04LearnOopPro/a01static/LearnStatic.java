package a04LearnOopPro.a01static;
/*
@author YwQ
@version 1.0
*/

public class LearnStatic {
    private String name;
    private int salary;
    //上为实例变量，下为类变量
    private static int age;

    public LearnStatic(String name, int salary) {
        this.name = name;
        this.salary = salary;

    }

    //getter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        LearnStatic.age = age;
    }

    //重构toString


    @Override
    public String toString() {
        return "LearnStatic{" +
                "name='" + name + '\'' +
                ", salary=" + salary +"age="+age+
                '}';
    }
    public static void hello(){
        System.out.println("hello!");
    }
}
