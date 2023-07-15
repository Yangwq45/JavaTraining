package a04LearnOopPro.a04abstract;
/*
@author YwQ
@version 1.0
*/

public class Circle extends GEometric{
    public Circle(double r){
        super(r);
    }

    @Override
    public double GetLong() {
        return super.getR()*super.getR()*Math.PI;
    }

    @Override
    public double GetSpace() {
        return 2*Math.PI*this.getR();
    }
}
