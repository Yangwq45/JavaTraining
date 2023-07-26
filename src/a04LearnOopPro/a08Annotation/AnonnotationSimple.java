package a04LearnOopPro.a08Annotation;
/*

@version 1.0
*/

//如果自定义注解没有  String value(); 注解可空,若有则需写入内容.
//@MyAnnotation()

import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;



@MyAnnotation("WWWW")
//@MyAnnotation(value = "2232323")与以上的结构作用一致
public class AnonnotationSimple {
    public void walk(){
        System.out.println("学生走路");
    }
    @Deprecated
    public void print(){
        System.out.println("过时的方法");
    }

    public static void main(String[] args) {
        AnonnotationSimple a =new Stu();
        a.walk();
        //抑制编译器警告,可赋予多个值
        @SuppressWarnings({"unused","www"}) int a1=12;
    }
}
 class Stu extends AnonnotationSimple{
        @MyAnnotation("QWQW")
    public void walk() {
        System.out.println("ddsds");
    }

}