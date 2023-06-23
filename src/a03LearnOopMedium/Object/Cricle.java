package a03LearnOopMedium.Object;
/*
@author YwQ
@version 1.0
*/

import org.w3c.dom.css.CSSImportRule;

public class Cricle extends Geometric {
    private double radius;
//    public Cricle(){
//        super();
//    };
    public Cricle (double radius){
        this.radius=radius;
    }
    public Cricle(double radius,String color,double weight){
        super(color,weight);
        this.radius=radius;
    }
    public double fiindAREa(){
        return 3.14*radius*radius;
    }

//重写的euqals，判断两个对象的radius是否一致
    public boolean equals(Object obj) {
        if(this==obj)return true;//此时是判断是否指向同一对象，若是，则值肯定一样
        else if (obj instanceof  Cricle==false) {
            //instance 判断对象变量是否是一个类的对象或者其子类的对象变量
            //此时是用来判断非instance情况，好向上转型来判断值
            Cricle cricle=(Cricle) obj;
            return this.radius==cricle.radius;
        }
        else return false;
    }

    @Override
    public String toString() {
        return "radius is "+radius;
    }



}


