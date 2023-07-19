package a04LearnOopPro.a05Interface.a02Dynamic;
/*
@author YwQ
@version 1.0
*/

public class Animal implements Cat,Dog {
    @Override

    @Override
    public void Barkdefault() {
        Cat.super.Barkdefault();
        System.out.println("CAT MEOW MEOW  ");
    }

    public static void main(String[] args) {
        Animal animal=new Animal();
        animal.Barkdefault();
        animal.Bark();
    }
}
