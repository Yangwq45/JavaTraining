package LearnOop;
/*
@author YwQ
@version 1.0
*/

import LearnOop.GetandSet.Books;

public class BasicOop {
    public static void main(String[] args) {
        Person pr = new Person();
        pr.zhijing=12;
        System.out.println(pr.GetSpace());
        System.out.println(pr.method(10,4));
        pr.getBirthdfay();

        //From get and Set packet
        Books books =new Books();
        books.setAuther(" me");
        books.setName(" the story of Dandao");
        books.setPrice(1280);
        books.setPublisher(" China Book ");
        books.getAllInfo();
    }
}
