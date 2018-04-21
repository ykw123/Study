package vs;

import java.io.IOException;

/**
 * @author ykw
 * @version 创建时间:2018/4/21
 */
public class TestMain {
    public static void  main(String[] args){
        try {
            new PlainNioServer().server(1123);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
