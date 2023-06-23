package a02LearnOop.Poly;
/*
@author YwQ
@version 1.0
*/

public class Dog extends Animal {
    public Dog( String name,int age,String type){
        super(name,age,type);
    };

    public Dog() {
       super();
    }

    public String bark(){
        return"Woof ";

    }
    //new method
    public void run(){
        System.out.println("RUNNNNNING!!!!!");
    }
}
