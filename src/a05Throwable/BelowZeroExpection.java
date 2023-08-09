package a05Throwable;
/*
@author YwQ
@version 1.0
*/

public class BelowZeroExpection extends Exception{
    //自定义异常都需要加`serialVersionUID`
    static final long serialVersionUID=12121212;
    private int id;

    //推荐两个构造器,一个有参一个无参
    //构造器定义参照Exception ,即为其继承的父类
    public BelowZeroExpection() {
        super();
    }

    public BelowZeroExpection(String message,int id) {
        super(message);
        this.id=id;
    }

    public BelowZeroExpection(String message, Throwable cause) {
        super(message, cause);
    }
    public BelowZeroExpection(Throwable cause) {
        super(cause);
    }

    public int getId() {
        return id;
    }
}

class B {
//此时也有多态,根据情况throw
    public void regist(int num) throws BelowZeroExpection {
        if (num < 0)
            throw new BelowZeroExpection("人数为负值，不合理", 3);
        else
            System.out.println("登记人数" + num);
    }
//调用处用trycatch接收
    public void manager() {
        try {
            regist(100);
        } catch (BelowZeroExpection e) {
            System.out.print("登记失败，出错种类" + e.getId());
        }
        System.out.print("本次登记操作结束");
    }
    public static void main(String args[]) {
        B t = new B();
        t.manager();
    }
}



 class ReturnExceptionDemo {
    static void methodA() {
        try {
            System.out.println("进入方法A");
            throw new RuntimeException("制造异常");
        }finally {
            System.out.println("用A方法的finally");
        }
    }

    static void methodB() {
        try {
            System.out.println("进入方法B");
            return;
        } finally {
            System.out.println("调用B方法的finally");
        }
    }
    public static void main(String[] args) {
        try {
            methodA();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        methodB();
    }
}