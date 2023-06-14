package LearnOop.OverLoad;
/*
@author YwQ
@version 1.0
*/

public class ZhichuandiOop {
    int a,b;
    public void shiftNum(ZhichuandiOop am){
//        am=new ZhichuandiOop();
        int temp=0;
        temp=am.a;
        am.a=am.b;
        am.b=temp;
        System.out.println("in the tethod a andb is"+am.a+"\n"+am.b);
    }
}
