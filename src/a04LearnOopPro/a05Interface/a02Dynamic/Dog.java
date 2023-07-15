package a04LearnOopPro.a05Interface.a02Dynamic;
/*
@author YwQ
@version 1.0
*/

public interface Dog {
    double WEIGHT=10;
    public abstract void Bark();
    public static void Barkstatic(){
        System.out.println("staticbark isWOOOF" );

    }
    public default void Barkdefault(){
        System.out.println("default bark ");
    }
}
