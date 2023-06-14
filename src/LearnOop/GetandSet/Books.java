package LearnOop.GetandSet;
/*
@author YwQ
@version 1.0
*/

public class Books {
   private double price;
    private String name;
    private String auther,Publisher;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String publisher) {
        Publisher = publisher;
    }
    public void  getAllInfo(){
        System.out.println("Name is"+name+"   price is"+price+"   auther is "+auther);
    }

}
