package LearnOop.Poly;
/*
@author YwQ
@version 1.0
*/

public class base {
    int a=10;
    public void display(){
        System.out.println(this.a);
    }

    public static void main(String[] args) {
        base bas=new sub();
        bas.display();
        System.out.println(bas.a);
        sub sub=base;//不能这么做，因为虽然base指向的是
        sub.display();
        System.out.println(sub.a);
        System.out.println(sub==base);
        Objects objects =new base();
        objects
    }
}
class sub extends base{
    int a=20;
    public void display(){
        System.out.println(this.a);
    }

}