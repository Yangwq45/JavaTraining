package a05Throwable.exer2;
/*
@author YwQ
@version 1.0
*/

import a05Throwable.BelowZeroExpection;

public class DivisionDemo {
    public static void main(String[] args) {
      //  int m=Integer.parseInt(args[0]);
        //int n=Integer.parseInt(args[1]);

        //调用自定义异常方法要try--

        //运行时异常会自动捕捉,所以一部分异常在方法中并没有设置if去抛出
        try{
            int a=DivisionDemo.divide(1,0);
        }catch(ArrayIndexOutOfBoundsException a){
            System.out.println(a.getMessage());
            a.printStackTrace();
        }catch(BelowZeroExpection b){
            b.printStackTrace();
        }catch(NumberFormatException e){
        System.out.println("数据类型不一致");}
//        catch(ArrayIndexOutOfBoundsException e){
//                System.out.println("缺少命令行参数");}
//        catch(ArithmeticException e){
//                        System.out.println("除0");
//        }
    }
//使用异常的地方先用if语句过滤条件
    //使用非运行时记得手动抛出异常
    public static int divide(int a,int b) throws BelowZeroExpection {
    if(a==0||b==0){
        throw new ArrayIndexOutOfBoundsException("有一个为0");
    }if(a<0||b<0){
        throw new BelowZeroExpection("有一个小于0",1);
        }
    else return a/b;

}}