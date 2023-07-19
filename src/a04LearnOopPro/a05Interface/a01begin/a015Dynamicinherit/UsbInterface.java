package a04LearnOopPro.a05Interface.a01begin.a015Dynamicinherit;
/*
@author YwQ
@version 1.0
*/

public class UsbInterface {
    public static void main(String[] args) {
        //创建接口实现类的对象
        Usb usb=new KeyBoard();
        Usb usb1 =new Printer();
        Computer.transfetInfo(usb);
        Computer.transfetInfo(usb1);
        //实现类的匿名对象
        Computer.transfetInfo(new Printer());
        Computer.transfetInfo(new KeyBoard());
        //创建接口匿名实现类的对象
        Usb usb2=new Usb() {
            @Override
            public void in() {
                System.out.println("匿名实现的USB in");
            }

            @Override
            public void out() {
                System.out.println("n匿名实现的USB out");
            }
        };
        Computer .transfetInfo(usb2);

        //创建接口匿名实现类的匿名对象
        Computer.transfetInfo(new Usb() {
            @Override
            public void in() {
                System.out.println("匿名实现Usb的匿名对象in");
            }

            @Override
            public void out() {
                System.out.println("匿名实现Usb的匿名对象out");
            }
        });
    }
}
