package a04LearnOopPro.a03CodeBlock;
/*
@author YwQ
@version 1.0
*/

import java.text.SimpleDateFormat;
import java.util.Date;

public class LeafTest {
    public static void main(String[] args) {
        Long time = System.currentTimeMillis();  //获取当前时间
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHH");
        String date = format.format(time);//注意这里返回的是string类型

        String nowMs = format.format(new Date()).trim();
        System.out.println(nowMs);
        try {
            int a = Integer.parseInt(nowMs);
            System.out.println(a);
        }catch(NumberFormatException a) {
            System.out.println(a);
            //System.err.println("Unable to convert input string :" + a + " to int");
        }

    }
}
