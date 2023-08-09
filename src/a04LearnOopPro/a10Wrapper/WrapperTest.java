package a04LearnOopPro.a10Wrapper;
/*
@author YwQ
@version 1.0
*/

import org.junit.Test;

public class WrapperTest {

    //基本数据类---->包装类
@Test
public void test(){
    //传值可以传实参克形参.
    int a=12;
    //    此方法已经被标志弃用,不建议使用,
//        使用构造器创建包装类的方法都不建议使用(标志废弃)
    //应使用valueOf()
    Integer in=new Integer(a);
    // 换成valueOf()
    Integer integer=Integer.valueOf(a);
    Integer integer1=Integer.valueOf(13);
    System.out.println(integer1.toString()+integer);

    //
    float f1=12.4F;
    Float f=Float.valueOf(f1);
    System.out.println(f.toString());

    //float和其他包装类可以传入不同类型的值
    String s="32.13";
    System.out.println(s);
    Float fl=Float.valueOf(s);
    System.out.println(s);

    Double dou=Double.valueOf(1212.4);
    System.out.println(dou.doubleValue());

    //注意boolean的包装类需要String类型的形参
    boolean b=true;
    Boolean bo=Boolean.getBoolean(String.valueOf(b));
    Boolean bo1=Boolean.valueOf(b);

//拆箱
    int qw=integer1.intValue();
    double fvb=f.doubleValue();
    //double he float可以互相拆
    float fdf=dou.floatValue();

    boolean boo=bo.booleanValue();

}

//包装类---->基本类型
    @Test public void test1(){
    Integer ii=Integer.valueOf(123);
    int i=ii.intValue();
        System.out.println(i);

    }
    @Test public void test2(){
    //自动装箱拆箱
        Integer a=1;//==Integer a=Integer.valueof(1)
        a+=2;//等号右边：将i对象转成基本数值(自动拆箱) i.intValue() + 5;
        System.out.println(a);
    }


}
