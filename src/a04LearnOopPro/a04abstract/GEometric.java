package a04LearnOopPro.a04abstract;
/*
@author YwQ
@version 1.0
*/

public abstract class GEometric {
    private double r;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public GEometric(double r) {
        this.r = r;
    }

    public abstract double GetSpace();
    public abstract double GetLong();
}
