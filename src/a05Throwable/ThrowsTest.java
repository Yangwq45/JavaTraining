package a05Throwable;
/*
@author YwQ
@version 1.0
*/

import javax.net.ssl.SSLException;
import java.io.IOException;

public class ThrowsTest {

}

class Father {
    public static void main(String[] args) {
        Father f=new Son();
            try{f.throwa();
                //实际上抛的是子类的异常
    }catch(IOException e){}
    }

    public void throwa ()throws IOException{}
}
class Son extends  Father{
    @Override
    public void throwa() throws SSLException {

    }

}