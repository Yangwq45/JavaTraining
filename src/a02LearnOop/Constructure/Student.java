package a02LearnOop.Constructure;
/*
@author YwQ
@version 1.0
*/

public class Student extends Prson{
    public Student(){
        //空构造器，如果出现了非空构造器，就得手动加
    };
    public Student (int a,String b){
        this.setName(b);
        this.setBirth(a);
    }

@Override
    public void setBirth(int birth) {
        System.out.println("Overrided");
    }

}
