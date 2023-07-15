package a04LearnOopPro.a05Interface.a02Dynamic;
/*
@author YwQ
@version 1.0
*/

public interface Cat {
    double WEIGHT=5;
    public abstract void Bark();
    public static void Barkstatic(){
        System.out.println("staticbark is Meow" );

    }
    public default void Barkdefault(){
        System.out.println("default bark ");
    }
}
