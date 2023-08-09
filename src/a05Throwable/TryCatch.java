package a05Throwable;
/*
@author YwQ
@version 1.0
*/

import org.junit.Test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
    @Test
    public void test(){
    try{
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();//这时在控制台输入非int;

        //trycatch 父类要放在下面,否则编译错误 java: 已捕获到异常错误java.util.InputMismatchException
//    }catch (RuntimeException e){
//        System.out.println("RUntimeException ");
    }catch(InputMismatchException e){
       e.printStackTrace();
//        e.getMessage();
        System.out.println("出现 InputMismatchException 异常");
        }
    }

}
