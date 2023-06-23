package a02LearnOop.GetandSet;
/*
@author YwQ
@version 1.0
*/

public class Interface {
    public static void main(String[] args) {
        Books books =new Books();
        books.setAuther(" me");
        books.setName(" the story of Dandao");
        books.setPrice(1280);
        books.setPublisher(" China Book ");
        books.getAllInfo();
    }
}
