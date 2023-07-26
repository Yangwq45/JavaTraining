package a04LearnOopPro.a06InnerClass.simplebegining;
/*
@author YwQ
@version 1.0
*/

public class ObjTest {
    //供给内部类测试用
    public int num = 12;
    public static int num1 = 13;

    void output() {
        System.out.println("OuterClass nostatic method");
    }

    static void output2() {
        System.out.println("OuterClass static method");


    }

    public static void main(String[] args) {
        //非静态内部类
        ObjTest objTest = new ObjTest();
        ObjTest.abc abbc = objTest.new abc(12, "34");
        System.out.println(abbc.toString());
        abbc.outputOuterClassMenber();
        //静态内部类
        ObjTest.Def def = new ObjTest.Def(12, "23");
        def.outputOuterMem();

        //局部内部类
        class a{
            int a;
            public void PutA(){
                System.out.println(a);
            }
        }
        class b{
            int b;
            public void PutA(){
                System.out.println(b);
            }
        }
        //测试局部内部类
        a a=new a();
        a.PutA();
        b b=new b();
        b.PutA();
    }

    //非静态内部类
    class abc {
        private int age;
        private String name;

        public abc(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        //外部类测试区
        //toString里面夹一个外部类的num
        @Override
        public String toString() {
            return "abc{" +
                    "age=" + age +
                    ", name='" + name + '\''
                    + "outerNUm" + num + '}';
        }

        public void outputOuterClassMenber() {
            //非静态内部类可以使用静态及非静态的成员
            System.out.println(num);
            output();
            output2();
        }
    }

    static class Def {
        private int name;
        private String age;

        public Def(int a, String b) {
            this.age = b;
            this.name = a;
        }

        public int getName() {
            return name;
        }

        public void setName(int name) {
            this.name = name;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        //外部类测试区
        public void outputOuterMem() {
            //静态内部类指南使用外部的静态成员
            System.out.println("outerStaticIs+ " + num1);
            output2();
        }
    }
}
