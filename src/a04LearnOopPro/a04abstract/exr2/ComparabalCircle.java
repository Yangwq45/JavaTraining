package a04LearnOopPro.a04abstract.exr2;
/*
@author YwQ
@version 1.0
*/

public class ComparabalCircle extends Circle {

    public ComparabalCircle(double r){
        super(r);
    }

    @Override
    public boolean CompareTO(Circle a) {
        if(this.getRadius()>=a.getRadius()){
            return true;
        }else return false;
    }
}
