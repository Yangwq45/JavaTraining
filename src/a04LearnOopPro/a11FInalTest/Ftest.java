package a04LearnOopPro.a11FInalTest;
/*
@author YwQ
@version 1.0
*/

import org.junit.Test;

public class Ftest {
    public static void aa(){
        System.out.println("aaaa");
    }

    @Test
    public void test(){
        Ftest bb=new B();
        bb.aa();
        Ftest ff=null;
        ff.aa();
    }
}
class B extends Ftest{
    public static void aa(){
        System.out.println("qqqq");
    }



}
