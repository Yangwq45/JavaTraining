package a04LearnOopPro.a05Interface.a025DynamicInterface;
/*
@author YwQ
@version 1.0
*/

public interface Usb3 {
    public default void transfer(){
        System.out.println("TTTF USB3");
    }
}
