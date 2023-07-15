package a04LearnOopPro.a05Interface.a01begin;
/*
@author YwQ
@version 1.0
*/

public class TheClass implements  CompareExt{
    @Override
    public boolean compaRe(int a, int b) {
        if(a>=b) return true;
        else return false;
    }

    @Override
    public void stop() {
        
    }

    @Override
    public void sto() {

    }

    @Override
    public void method2() {

    }
}
