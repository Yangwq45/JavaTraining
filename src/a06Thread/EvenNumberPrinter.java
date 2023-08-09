package a06Thread;
/*
@author YwQ
@version 1.0
*/

public class EvenNumberPrinter implements  Runnable{
    @Override
    public void run() {
        System.out.println("RUnned "+Thread.currentThread().getName());
    }



    public static void main(String[] args) {
        EvenNumberPrinter evenNumberPrinter=new EvenNumberPrinter();
        Thread t=new Thread(evenNumberPrinter);
        t.setName("WWW");
//        t.start();
        new Thread(t){
            @Override
            public void run() {
                System.out.println("d");
            }
        }.start();
    }
}
