package a04LearnOopPro.a06InnerClass.AnonymousClass;
/*
@author YwQ
@version 1.0
*/

public class Anonymous1 {
    public Comparable getInstance() {

        //提供了实现了Comparable接口的内部类


        // 方式1:提供了接口的实现类 的 匿名对象
        class MyComparable implements Comparable {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        }
        return new MyComparable();

        //方式2：提供了接口的匿名实现类的对象
//        Comparable c = new Comparable() {
//            @Override
//            public int compareTo(Object o) {
//                return 0;
//            }
//        };
//        return c;


//方式3:提供了接口的匿名实现类 的 匿名对象
//        return new MyComparable() {
//            @Override
//            public int compareTo(Object o) {
//                return 0;
//            }
//        };
    }

}

