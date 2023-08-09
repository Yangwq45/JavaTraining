package a06Thread;
/*
@author YwQ
@version 1.0
*/

public class Exer {
    public static void main(String[] args) {
        AA a=new AA();
        BB b=new BB(a);
        b.start();

        //匿名子类的匿名对象本来不用传入构造器
        //但是传入后也没关系,因为匿名子类重写了方法,执行的是匿名子类的run
        //如果把方法注释掉,相当于直接调用thread的run方法,使用的是BB类的方法,因为b是BB的对象
        new Thread(b){
            @Override
            public void run() {
                System.out.println("overwritted");
        }}.start();

    }
}
class AA extends Thread{
    @Override
    public void run() {
        System.out.println("aaaa");
    }
}
class BB extends Thread{
    AA a;
    public BB(AA a){
     //   this.a=a;
//这种操作并不会改变输入thread 的对象

        //目的是为了改变传入target的对象,进而改变run.
        super(a);
    }
    @Override
    public void run() {
        System.out.println("bb");
    }
}