package a04LearnOopPro.a05Interface.a015Dynamicinherit;
/*
@author YwQ
@version 1.0
*/

public class Printer implements Usb{
    @Override
    public void in() {
        System.out.println("Printer in");    }
    public void out(){
        System.out.println("printer out");
    }
}
