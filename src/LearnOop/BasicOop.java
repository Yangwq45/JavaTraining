package LearnOop;
/*
@author YwQ
@version 1.0
*/

public class BasicOop {
    public static void main(String[] args) {
        Person pr = new Person();
        pr.zhijing=12;
        System.out.println(pr.GetSpace());
        System.out.println(pr.method(10,4));
        pr.getBirthdfay();
    }
}
