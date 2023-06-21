package LearnOop.Poly;
/*
@author YwQ
@version 1.0
*/

public class Cat extends Animal {
        public Cat( String name,int age,String type){
            super(name,age,type);
        };

        @Override
    public void setName(String a){
            System.out.println("if name ==a , we will do nothing");
            if(a.equals("a"));
            else {
                super.setName(a);
            };

        }
        @Override
        public String bark(){
            return"Meow ";

        }
}
