package LearnOop.OverLoad;
/*
@author YwQ
@version 1.0
*/

public class Test {
    public static void main(String[] args) {
    TestOop []testOops=new TestOop[3];
        for (int i = 0; i < testOops.length; i++) {
            testOops[i]=new TestOop();
            System.out.println( testOops[i].retuana(1.3,2));
            System.out.println(testOops[i].retuana(1,2));
            System.out.println(testOops[i].returna(1,2.3));
        }
    }
}
