package a04LearnOopPro.a05Interface.a01begin.a015Dynamicinherit;
/*
@author YwQ
@version 1.0
*/

public class KeyBoard implements Usb{
    @Override
    public void in() {
        System.out.println("Keyboard in");    }
    public void out(){
        System.out.println("Keyboard out");
    }
}
