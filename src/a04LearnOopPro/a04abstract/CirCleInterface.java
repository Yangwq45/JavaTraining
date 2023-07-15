package a04LearnOopPro.a04abstract;
/*
@author YwQ
@version 1.0
*/

public class CirCleInterface {
    public static void main(String[] args) {
        Circle circle=new Circle(12.0);
        System.out.println(circle.GetLong()+"\n" +
                circle.GetSpace() +"\n"+ circle.getR()        );
    }
}
