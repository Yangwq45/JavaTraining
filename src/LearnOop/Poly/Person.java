package LearnOop.Poly;
/*
@author YwQ
@version 1.0
*/

import java.util.Scanner;

public class Person {
 static Animal animal;
    //TODO:方法内的对象uh被回收
    public void pet() {

        System.out.println("in put what animal U want to feed \n input DOg/Cat");

        Scanner scanner = new Scanner(System.in);
        String st = scanner.next();
        if (st.equals("Cat")){
            animal=new Cat("2323",23,"gold");
            animal.bark();
        }else if(st.equals("dog")){
            animal=new Dog("3454",43,"white");
        }
    }

    public void Petpet(Animal animal){
        System.out.println(animal.bark());
    }

    public static void main(String[] args) {
//        Dog dg=new Dog();
        Person pr=new Person();
        pr.pet();
        System.out.println(animal.getAge());

        //向上转型与向下转型
        //向上转型
        Animal ani =new Dog("12",12,"12");
        ani.bark();
        //向下转型，克调用子类特有的方法
        Dog dog =(Dog)ani;
        dog.run();


    }
}
