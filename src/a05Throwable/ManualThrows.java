package a05Throwable;
/*
@author YwQ
@version 1.0
*/

import java.io.IOException;

public class ManualThrows {
    public static void main(String[] args) {

        Stu stu =new Stu(-1);
        try{
            stu.regist(-1);
        }catch(RuntimeException exception){
            exception.printStackTrace();
        }finally {
            System.out.println("若错误,则已经打印错误格式");
        }
       // 运行时异常可以不用try catch
//        stu.regist(-1);

//        try{
//            stu.regist1(-2);
//        }catch(Exception e){
//            e.printStackTrace();
//        }finally {
//            System.out.println("异常已经打印");
//        }
    }
}

class Stu{
    int id;
    public Stu(int id){
        this.id=id;
    }
    public void regist(int id)throws RuntimeException{
        if(id >0){
            this.id=id;
        }else {
            System.out.println("输入id非法");
            //手动抛出异常
            throw new RuntimeException("输入格式非法");
        }
    }
    //手动抛出编译时异常,需要在方法体上加throws
    public void regist1(int id)throws Exception{
        if(id >0){
            this.id=id;
        }else {
            System.out.println("输入id非法");
            //手动抛出编译异常,此异常需要try catch处理
            throw new Exception("输入格式非法");
        }
    }
}
