package a04LearnOopPro.a04abstract;
/*
@author YwQ
@version 1.0
*/

public abstract class Animal {
    private String name;
    private int age;
    private String spicies;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpicies() {
        return spicies;
    }

    public void setSpicies(String spicies) {
        this.spicies = spicies;
    }
    //method
    public abstract void bark();
    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", spicies='" + spicies + '\'' +
                '}';
    }


}
class Dog extends Animal{
    public static void main(String[] args) {
        Dog dog =new Dog();
        dog.bark();
    }
    public void bark(){
        System.out.println("WWWWOF");
    }
}