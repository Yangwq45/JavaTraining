package a03LearnOopMedium.Object;
/*
@author YwQ
@version 1.0
*/

public class Interface

{
    public static void main(String[] args) {
        Cricle cricle=new Cricle(12,"we",34);
        System.out.println(cricle.toString());
        Object obj=new Object();
        System.out.println(cricle instanceof Cricle);
        System.out.println(obj instanceof Cricle);
        System.out.println(obj instanceof Object);
        System.out.println(obj instanceof Cricle);
        System.out.println(cricle instanceof Object);

    }
}