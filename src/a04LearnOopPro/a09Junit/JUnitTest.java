package a04LearnOopPro.a09Junit;
/*
@author YwQ
@version 1.0
*/


import org.junit.Test;

import java.util.Scanner;

//
public class JUnitTest {
//    int a;
//    public JUnitTest(int a,int b) {
//        this.a=a;
//    }

    @Test
    public void test(){
        System.out.println("HELL o");
        test1(12);
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        System.out.println(a);
    }
    public void test1(int a){
        System.out.println("test1"+a);
    }

    
}
