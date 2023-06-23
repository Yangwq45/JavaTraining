package a02LearnOop.Constructure;
/*
@author YwQ
@version 1.0
*/
public class Person{}

 class Prson {
    private String name;
    private int birth;
    public Prson(){}
    public Prson(int a,String b){
        name=b;
        birth=a;
    }

    public String getName() {
//        return name;
        if(name.equals("212")&&name!=null) return "true name";
        else return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirth() {
        return birth;
    }
    public void setBirth(int a){
        birth=a;
    }
}
