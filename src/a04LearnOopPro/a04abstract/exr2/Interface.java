package a04LearnOopPro.a04abstract.exr2;
/*
@author YwQ
@version 1.0
*/

public class Interface {
    public static void main(String[] args) {
        ComparabalCircle circle=new ComparabalCircle(12);
        ComparabalCircle circle1=new ComparabalCircle(13);
        ComparabalCircle circle2 =new ComparabalCircle(12);
        System.out.println(circle.CompareTO(circle1)+"\n"+circle.CompareTO(circle2));
    }
}
