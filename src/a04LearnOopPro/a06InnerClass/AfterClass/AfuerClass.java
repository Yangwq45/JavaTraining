package a04LearnOopPro.a06InnerClass.AfterClass;
/*
@author YwQ
@version 1.0
*/
//编写匿名内部类继承Object，并且在匿名内部类中
//声明public voud test()方法
public class AfuerClass {
    public static void main(String[] args) {
        //普通的创建对象的方法
        ObjTest objTest =new ObjTest();
        objTest.test();
        //继承于objectTest的匿名子类创建的对象
        ObjTest ob=new  ObjTest(){
            @Override
            public void test() {
                System.out.println("AAAA 匿名内部类");
            }
        };
        ob.test();
        //继承Object的匿名子类的匿名对象
        new ObjTest(){
            @Override
            public void test() {
                System.out.println("AAAAA 匿名子类的匿名对象");
            }
        }.test();
    }
}
class ObjTest extends Object{
    public void test(){
        System.out.println("aaaa");
    }
}