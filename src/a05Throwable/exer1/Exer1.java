package a05Throwable.exer1;
/*
@author YwQ
@version 1.0
*/

import a05Throwable.exer1.NoLifeValueException;

public class Exer1 {
    private int health;
    private  String name;

//有参构造器用get方法,以便调用异常
    //因为调用自定义异常,故在构造器中使用try catch
    public Exer1( int health,String name){
//        this.health=health;
//        this.name=name;
        //在调用自定义异常处使用try catch
        try{this.setHealth(health);}
        catch(NoLifeValueException noLifeValueException){
            noLifeValueException.printStackTrace();
        }finally {
            System.out.println("出现血量为负数的错误,一下为错误信息");
        }
        this.setName(name);
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) throws NoLifeValueException{
        if (health<0){
            throw new NoLifeValueException("health cant be less than zero");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public static void main(String[] args) {
        Exer1 exer1=new Exer1(-12,"dswds");
        exer1.toString();

    }
}
