package a01basicjava;
/*
@author YwQ
@version 1.0
*/
import a02LearnOop.BasicOop;
public class ForTest {
    public static void main(String[] args) {
        int a=10,b=10;
        method(a,b);
        System.out.println(a+"\t"+b);
    }

    //method
    public static void method(int a,int b){
        int m=10;
        a=a*=m;b=b*=m;
    }
}
