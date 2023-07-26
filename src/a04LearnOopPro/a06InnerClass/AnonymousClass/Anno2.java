package a04LearnOopPro.a06InnerClass.AnonymousClass;
/*
@author YwQ
@version 1.0
*/

public class Anno2 {
    public double method (int a,int b){
        return a+b;
    }

    public static void main(String[] args) {
        //类的匿名子类的的对象
        Anno2 anno2=new Anno2(){
            @Override
            public double method(int a, int b) {
                return super.method(a, b) * a * b;
            }
        };
        System.out.println(anno2.method(1,2));

        //类的匿名子类的匿名对象
        double c=new Anno2(){
            @Override
            public double method(int a, int b) {
                return super.method(a, b)*(a+b);
            }
        }.method(1,2);
        //此时这种句式并不能起作用，因为返回的是类的匿名子类的匿名对象的方法，需要用变量去获取值
        System.out.println(c);

//继承父类的匿名对象
        class anno3 extends Anno2{
            @Override
            public double method(int a, int b) {
                return super.method(a, b)+a;
            }
        }
        //下面的方法只是在举例，看情况返回继承父类的匿名对象的东西
        //return new anno3();
    }
}