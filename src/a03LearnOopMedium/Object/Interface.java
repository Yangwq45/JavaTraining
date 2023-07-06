package a03LearnOopMedium.Object;
/*
@author YwQ
@version 1.0
*/

import java.util.Scanner;

public class Interface

{
    public static void main(String[] args) {
        Object obj=new Object();
        System.out.println(obj.getClass());
        Cricle cricle=new Cricle(2.1,"d",12);
        System.out.println(cricle.getClass());
        AaE aaE=new AaE();
        System.out.println(aaE.getClass());
    }



}