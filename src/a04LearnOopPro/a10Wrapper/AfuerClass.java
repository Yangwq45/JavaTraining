package a04LearnOopPro.a10Wrapper;
/*
@author YwQ
@version 1.0
*/

import a03LearnOopMedium.Object.Interface;
import org.junit.Test;

import java.util.Scanner;
import java.util.Vector;

public class AfuerClass {
    @Test
    public void test(){
//创建Vector
    Scanner sc=new Scanner(System.in);
    Vector v=new Vector();
    //赋值
        int maxScore=0;
    for(;;){
        System.out.println("enter 0 to quit");
        int m=sc.nextInt();
        if(m==0)break;
    // #todo == and equals和使用sc.next的时候总会要求输入.
//        Integer integer=Integer.valueOf(m);
//        v.addElement(integer);
        //自动装箱
        v.addElement(m);


        //获取最大

        if (maxScore <m) {
            maxScore=m;
        }

    }
        System.out.println("the size of vwector is "+v.size()+'\n');
    //获取最大
        System.out.println("the max is \t"+maxScore);

        //依次获得v的每个学生的成绩,并且与最高分比较,获取等级
        for (int i=0;i<v.size();i++){
            Object objScore=v.elementAt(i);//返回的是对象,用对象接受
//            Integer IntegerScore=(Integer) objScore;
//            //拆箱
//            int score=IntegerScore.intValue();
        //自动装箱拆箱
        int score=(Integer)objScore;
        //划分档位
            char grade= ' ';
            if(maxScore - score <= 10){
                grade = 'A';
            }else if(maxScore - score <= 20){
                grade = 'B' ;
            }else if(maxScore - score <= 30){
                grade = 'C';
            }else{
                grade = 'D';}

            System.out.println("Student i "+i+"Greade is "+grade+"   Score is "+score);
        }
    }

    @Test public void test1(){
    Scanner scanner=new Scanner(System.in);
        if (scanner.next() == "n") {
            System.out.println("pass");
        }
    }

}
