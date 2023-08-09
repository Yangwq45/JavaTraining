package a0509_BigTest.team.service;
/*
@author YwQ
@version 1.0
*/
import a0509_BIgTest.team.domain.*;

//import static 可以导入类的静态结构.
//如此可以省去Data.Employee,可以直接用Employee
import static  a0509_BigTest.team.service.Data.*;
import a0509_BigTest.team.domain.*;
public class NameListService {
    private Employee[] employees;

    public NameListService(){
        //根据成员构建数组
        //作者使用switch构建,其实用if也行
//        for (int i = 0; i <Data.EMPLOYEES.length ; i++) {
//            if(Data.EMPLOYEES[i][0].equals("10")){
//                employees[i]=new Employee(Integer.parseInt(Data.EMPLOYEES[i][1]),Data.EMPLOYEES[i][2],Integer.parseInt(Data.EMPLOYEES[i][3])
//               ,(int) Double.parseDouble(Data.EMPLOYEES[i][4]));
//            }
//        }

        for (int i = 0; i <Data.EMPLOYEES.length ; i++) {
            //int a=Integer.parseInt(Data.EMPLOYEES[i][0]);//员工的类型  //可以不用data.格式
            int type=Integer.parseInt(EMPLOYEES[i][0]);
            //获取通用的属性
            int id = Integer.parseInt(EMPLOYEES[i][1]);
            String name = EMPLOYEES[i][2];
            int age = Integer.parseInt(EMPLOYEES[i][3]);
            double salary = Double.parseDouble(EMPLOYEES[i][4]);
            Equipment equipment;
            double bonus;
            int stock;
            // 再根据Data类中的数据构建不同的对象，包括Employee、Programmer、Designer和Architect对象，以及相关联的Equipment子类的对象
            //将对象存于数组中
            //Data类位于com.atguigu.team.service包中
            switch(type){
                case EMPLOYEE:
                    employees[i] = new Employee(id,name,age,salary);
                    break;
                case PROGRAMMER:
                    equipment = createEquipment(i);
                    employees[i] = new Programmer(id,name,age,salary,equipment);
                    break;
                case DESIGNER:
                    equipment = createEquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    employees[i] = new Designer(id,name,age,salary,equipment,bonus);
                    break;
                case ARCHITECT:
                    equipment = createEquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    stock = Integer.parseInt(EMPLOYEES[i][6]);
                    employees[i] = new Architect(id,name,age,salary,equipment,bonus,stock);
                    break;
            }

        }


    }
//返回的是头部地址
    public Employee[] getEmployees(){
        return employees;
    }
//    public Employee getEmployee(int id)throws TeamException(){
//        return null;
//    }

}
