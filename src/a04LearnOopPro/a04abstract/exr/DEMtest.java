package a04LearnOopPro.a04abstract.exr;
/*
@author YwQ
@version 1.0
*/

public class DEMtest {
    public static void main(String[] args) {
        Employee[] emp=new Employee[3];
        emp[0]=new Develop("we",21,3434);
        emp[1]=new Develop("tre",45,34232);
        emp[2]=new Manager1("dfd",434,232323);
        for (int i = 0; i < 3; i++) {
            if(emp[i] instanceof Develop){
                Develop dev=(Develop)emp[i]; 
                emp[i].calMoney(dev.getWorkexp());
            }
        }
    }
}
