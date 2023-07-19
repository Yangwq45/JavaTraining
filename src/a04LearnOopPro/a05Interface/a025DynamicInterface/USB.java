package a04LearnOopPro.a05Interface.a025DynamicInterface;
/*
@author YwQ
@version 1.0
*/

public interface USB extends Usb2,Usb3{
    @Override
    default void transfer() {
        System.out.println("GGGGGGG");
    }
}
