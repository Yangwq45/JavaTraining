package a04LearnOopPro.a06InnerClass.AfterClass;
/*
@author YwQ
@version 1.0
*/

public class AfterClass1 {
    public static void main(String[] args) {
        //普通的创建接口的实现类的子类的对象的方法
        subA suba =new subA();
        suba.method();
        //创建接口的实现类的子类的匿名子类的对象
        subA suba1=new subA(){
            @Override
            public void method() {
                System.out.println("匿名子类的对象方法");
            }
        };
        suba1.method();
        //创建匿名接口的实现类的子类的匿名对象（只能一下子调用方法或成员）
        new subA(){
            @Override
            public void method() {
                System.out.println("匿名子类的匿名对象方法");
            }
        }.method();

        //抽象类区
        //1 普通的创建类的对象
        subB subB =new subB();
        subB.methodB();
        //创建类的匿名子类的对象
        subB subB1 =new subB(){
            @Override
            void methodB() {
                System.out.println("类的匿名子类的对象");
            }
        };
        subB1.methodB();
        //实现类的匿名子类的匿名方法
        new subB(){
            @Override
            void methodB() {
                System.out.println("匿名子类的匿名对象方法");
            }
        }.methodB();

        //证明对象所在类
        System.out.println("a的所在类"+suba.getClass()+"   a1d的所在类"+suba1.getClass()+"\n"
        +"   b的所在类"+subB.getClass()+"   b1d的所在类"+subB1.getClass());

        //子类对象所在父类的class
        System.out.println(suba.getClass().getSuperclass());


        //普通类继承

        //继承于c的匿名子类的对象
        C c=new C(){
    };
        c.method();
        System.out.println(c.getClass());
//子类对象所在父类的class
        System.out.println(c.getClass().getSuperclass());
}
}

interface A{
    public abstract void method();
}
class subA implements A{
    @Override
    public void method() {
        System.out.println("默认方法");
    }
}
//抽象类
abstract  class B{
    abstract void methodB();
}
//标准抽象类继承写法
class subB extends B{
    @Override
    void methodB() {
        System.out.println("SUb 实现抽象类方法");
    }
}
class C{
    void method (){
        System.out.println("MEthod c");
    }
}