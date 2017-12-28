import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by chenxk on 2017/12/21.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext classPathXmlApplicationContext=new ClassPathXmlApplicationContext("classpath*:applicationProvider2.xml");
         classPathXmlApplicationContext=new ClassPathXmlApplicationContext("classpath*:applicationProvider.xml");
        System.in.read();
    }
}
