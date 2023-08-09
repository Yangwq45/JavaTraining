package a05Throwable;
/*
@author YwQ
@version 1.0
*/

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FinallyTest {
    public static void main(String[] args) {
    int a=FinallyTest.test();
        System.out.println(a);
    }

    @Test
    public static  int test() {

        try {
            String str = "abc";
            int a = Integer.parseInt(str);
            System.out.println("捕获错误后");
            return 2;
        } catch (NumberFormatException e) {
            System.out.println("提供的字符串格式不对");
            return 1;

        } finally {
            System.out.println("finally");
            return 100;

        }
    }
    @Test public void test1(){
        FileInputStream fis=null;
        try{
        File file = new File("abc.txt");
       // FileInputStream fis = new FileInputStream(file);//FileNotFoundException
            //上面两个语句都有可能出现异常,所以不能拿出try,但不拿出try,finally里面无法识别fis
            fis = new FileInputStream(file);//FileNotFoundException
            //所以在里面赋值,声明放在外面


        int b = fis.read();//IOException
        while(b != -1){
            System.out.print((char)b);
            b = fis.read();//IOException
        }
        fis.close();//IOException
    }catch(FileNotFoundException e){
           // e.printStackTrace();
        }
        catch(IOException e){
//e.printStackTrace();
        }
        finally {
            //此语句必须执行所以放在finally中
         //   fis.close();//IOException
            //因为try中的语句只有咋try中使用,所以上面识别不了fis,解决方案在上面

            //因为close动作也可能导致异常,所以需要再包一层catch
            //夹一个if 放防止        File file = new File("abc.txt");出问题了
            if(fis!=null)try{fis.close();}
            catch(IOException e){
                e.printStackTrace();
            }finally {

            }
        }
    }

}
