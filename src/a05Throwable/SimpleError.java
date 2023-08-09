package a05Throwable;
/*
@author YwQ
@version 1.0
*/

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class SimpleError {
    public static void main(String[] args) {
        //Error
    //栈空间溢出  Exception in thread "main" java.lang.StackOverflowError
//        main(args);

        //Exception
    //堆溢出  Exception in thread "main" java.lang.NegativeArraySizeException: -1476958720
//    byte []bt=new byte[1234*4232*323232323*2323232];

    }
    @Test
    public void test() {
        //ArrayindexOutofBoundsException
        int[] a = {1, 3, 4, 5};

        int b = a[4];
    }
        @Test public void test2(){
            //NullPointerException
            SimpleError eim=new SimpleError();
            eim=null;
            // System.out.println(eim.toString());

            int[][]a=new int[3][];
            System.out.println(a[0].length);
            //错误因为未初始化
            String s="22323";
            s=null;
            s.length();


        }
@Test public void test3(){
//java.lang.ClassCastException
    //强制类型转化错误
        Object ob=new String();//非一个父类子类的
        SimpleError simpleError=(SimpleError) ob;
        simpleError.toString();
}

@Test public void test4(){
        //NumberFormatException
String bad="12234";
Integer integer=Integer.valueOf(bad);
int i=integer.intValue();
    System.out.println(i);
    //simple ver
    int i1=Integer.parseInt(bad);
    System.out.println(i1);
    //wrong
    int i2=Integer.parseInt(
            "1234d");
    System.out.println(i2);
}

@Test public void test5() {
        double num=12;
//    new Object(){
//         void outnum(double a) {
//            System.out.println(a);
//        }
//    }.outnum(num);

    //InputMismatchException
    Scanner scanner=new Scanner(System.in);
    int a=scanner.nextInt();//这时在控制台输入非int;

}
@Test public void test6(){
//java.lang.ArithmeticException  算术异常
    System.out.println(13/0);

}
//以上为运行时异常,下面为编译时异常
    @Test public void test7(){
        // java.lang.ClassNotFoundException
//    Class Aa = Class.forName("ewew");

    }
@Test public void test8(){
//    File file = new File(  "hello.txt");//可能报java.io.FileNotFoundException
//    FileInputStream fis = new FileInputStream(file);// 可能报java.io.FileNotFoundException
//    int data = fis.read() ;
//    while(data != -1){
//        System.out.print((char)data) ;
//        data = fis.read();
//    }
//    fis.close();
}


    }





