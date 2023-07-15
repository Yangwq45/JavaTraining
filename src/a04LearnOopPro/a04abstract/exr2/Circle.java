package a04LearnOopPro.a04abstract.exr2;
/*
@author YwQ
@version 1.0
*/

public abstract  class Circle {
    private double radius;

    public Circle(double r){
        this.radius=r;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public abstract boolean CompareTO(Circle a);
}
