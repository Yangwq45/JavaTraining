package a04LearnOopPro.a10Wrapper;
/*
@author YwQ
@version 1.0
*/

import org.junit.Test;

public class WrapTest1 {
    //String和包装类基本类型之间的转化
    @Test
    public void test(){
        //基本数据类型/包装类--->String

        //基本
        int i=1234;
        String s=String.valueOf(i);
        System.out.println(s);
        //包装
        Integer integer =i;
        String s1=String.valueOf(integer);
        System.out.println(s1);
        //简便
        String s2=i+"";
        String s3=integer+"";

    }
    @Test public void test1(){
        //Stirng----->基本数据类型
        String s="1234";
        int a=Integer.parseInt(s);
        System.out.println(a);

        //错误的 但只会在编译出错
        String s1="1234a";
        int a1=Integer.parseInt(s1);
        System.out.println(a1);

        //通过包装类转换
        String s2="1234533";
        Integer in=Integer.valueOf(s2);
        int ii=in;
        System.out.println(ii);



    }


}
