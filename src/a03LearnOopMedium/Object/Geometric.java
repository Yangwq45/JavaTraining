package a03LearnOopMedium.Object;
/*
@author YwQ
@version 1.0
*/

public class Geometric {
    protected String color="white";
    protected double weight=1.0;
    protected Geometric(){}
    protected  Geometric (String color ,double weight){
        this.color=color;this.weight=weight;
    }
    //get特然setter

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    //getter settter



}
