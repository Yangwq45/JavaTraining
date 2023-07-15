package a04LearnOopPro.a02SingleMode;
/*
@author YwQ
@version 1.0
*/

public class SingleHungry {
    private int num;
    private SingleHungry(){

    }
    private static SingleHungry singleHungry=new SingleHungry();

    public   static SingleHungry getSingleHungry() {
        return singleHungry;
    }

    public static void main(String[] args_23232) {
            SingleHungry singleHungry1=SingleHungry.getSingleHungry();
            

    }
}
