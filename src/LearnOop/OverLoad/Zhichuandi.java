package LearnOop.OverLoad;
/*
@author YwQ
@version 1.0
*/

public class Zhichuandi {


    public static void main(String[] args) {
        //int al=12;int b=13;

        ZhichuandiOop a=new ZhichuandiOop();
        a.a=12;a.b=10;
        a.shiftNum(a);
        System.out.println("in main a and b is"+a.a+"\n"+a.b);
    }
}
