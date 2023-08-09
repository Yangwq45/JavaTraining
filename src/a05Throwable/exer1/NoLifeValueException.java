package a05Throwable.exer1;
/*
@author YwQ
@version 1.0
*/

public class NoLifeValueException extends Exception{
    static final long serialVersionUID=12121212;
    private int id;
    public NoLifeValueException (){

    }
    public NoLifeValueException(String a ,int b){
        super(a);
        this.id=id;
    }
    public NoLifeValueException(String message ){
        super(message);
    }


}
