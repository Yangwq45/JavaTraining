package a04LearnOopPro.a01static;
/*
@author YwQ
@version 1.0
*/

public class StaticInterface {
    public static void main(String[] args) {
        LearnStatic learnStatic=new LearnStatic("12",54);
        System.out.println(learnStatic.toString());
        LearnStatic.setAge(1234);
        System.out.println(learnStatic.toString());

        LearnStatic learnS=new LearnStatic("12",54);
        System.out.println(learnS.toString());//证明类变量是共享的
        learnS.setAge(1);
        System.out.println(learnS.toString()+"/n"+learnStatic.toString());//xio
        //修改后类变量保持一致

        LearnStatic learnStatic1=null;
        learnStatic1.hello();

    }
}
