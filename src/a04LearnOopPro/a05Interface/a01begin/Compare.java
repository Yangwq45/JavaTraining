package a04LearnOopPro.a05Interface.a01begin;
/*
@author YwQ
@version 1.0
*/

public interface Compare {
    //默认公共静态常量
    public static final double AA=0;
    public final double BB=12;
    final double CC=12;
    double DD=13;
    public  double FF=4;


    //默认公共 抽象方法

    public abstract boolean compaRe(int a,int b);




    //默认方法
    public default void defa(){
        System.out.println("default method");

    }
    //静态方法
    public static void stat(){
        System.out.println("static method ");
    }
    //私有方法
     private void priv(){

        System.out.println("priv method");
    }

    //注意，此方法被当做私有方法
    public void stop() ;
//省略其中一个修饰词
     abstract void sto();


}
