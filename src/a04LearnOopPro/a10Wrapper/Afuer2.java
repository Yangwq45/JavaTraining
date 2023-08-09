package a04LearnOopPro.a10Wrapper;
/*
@author YwQ
@version 1.0
*/

import org.junit.Test;

public class Afuer2 {
    public static void main(String[] args) {
        Integer i = new Integer( 1);
        Integer j = new Integer(1);
        System.out.println(i ==j);//lfalse  俩对象地址肯定不同.
//底层都会谓用Integer的value0f()

        Integer m = 1; //自动的装箱
        Integer n = 1;
        System.out.println(m ==n);//true
        //Integer的valueof输入时期内容是存在一个Interfger类型的数组中的new好的Integer对象中
        // ,内容相同的Integer包装类的地址也是相同的
        //其为享元设计模式
        Integer x = 128;
        Integer y = 128;
        System.out.println(x ==y);//false
//因为vslueof的实现里面维护了一个数组,其大小在[-128  127]之间,超过了127会创建新对象
        //故128的时候是俩新的对象,地址不相等.
    }

    @Test
    public void test(){
       // /题目1:
        int i = 10;
        double d = 10.0;

        System.out.println(i == d);//true
        //题目2:
        Integer i1 = 10;Double d1 = 10.2;

//        System.out.println(i1 == d1);//编译会报错,但理论上两个对象地址不同,是false
        //编译报错因为==只能和相同类型的对比
        //题目3:
        Integer m = 1000;
        double n = 1000;
        System.out.println(m == n);//true
        //自动拆箱并且对比
        //因为拆箱更容易些.也避免了超过128的问题

        //timu4
        Integer x=1000;
        int x1=1000;
        System.out.println(x==x1);//true


    }
    @Test public void test2(){
        Object o1 = true ? new Integer( 1) :new Double(  2.0);
        System.out.println(o1);//1.0
        //三目运算符三目运算符后面两个位置的类型必须一致,所以1被饮食转化为1.0
        Object o2;
        if (true) {
            o2 = new Integer(1);
            System.out.println(o2);
            //结果是1
        }
else{
        o2 = new Double( 2.0);
        System.out.println(o2);
    }

}


}
