package a06Thread;
/*
@author YwQ
@version 1.0
*/
//1 创建继承于thread的子类
public class SimpleThread extends Thread{

        //定义指定线程名称的构造方法
        public SimpleThread(String name) {
            //调用父类的String参数的构造方法，指定线程的名称
            super(name);
        }

    public static void main(String[] args) {
        //3 创建 当前类的对象
        SimpleThread simpleThread =new SimpleThread("qwwq");
        //4 通过此对象调用start
        simpleThread.start();

        //面所在的线程的操作
        //其实是要表达两个线程并行处理,但数目太小会不产生交互
        for (int i = 0; i < 1000000000000000000L; i++) {
            if(i!=0&&i%10==0){
                //获取当前线程名字
                System.out.print(Thread.currentThread().getName()+ "********");
            }

        }
    }
        /**
         * 2 重写Thread类的run() --->将此线程要执行的操作，声明在此方法体中
         */
        @Override
        public void run() {

            for (int i = 0; i < 1000000000000L; i++) {
                System.out.println(getName()+"：正在执行！"+i);
            }
        }
}
class A extends Thread{
    public A(String name){
        super(name);
    }
    @Override
    public void run() {
        for (int i = 0; i < 1011212122L; i++) {
            if(i%2==0) System.out.println("thread name is + "+getName()+"the num is "+i);
        }
        System.out.println();
    }
}
class B extends Thread{
    public B(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 1010232323L; i++) {
            if(i%2!=0) System.out.println("thread name is + "+getName()+"the num is "+i);
        }
        System.out.println();
    }
}
class Test{
    public static void main(String[] args) {
        //老老实实创建对象
        A a=new A("testa");
        B b=new B("testb");
        a.start();
        b.start();

        //直接匿名类的匿名对象
        new Thread(){

            @Override
            public void run() {
                for (int i = 0; i < 1010232323L; i++) {
                    if (i % 2 != 0) System.out.println("thread name is + " + getName() + "the num is " + i);
                }
            }
        }.start();
    }
}