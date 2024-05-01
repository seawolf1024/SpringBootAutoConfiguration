package org.zhanshan;
import org.myspring.JettyWebServer;
import org.myspring.TomcatWebServer;
import org.myspring.ZhanshanSpringBootApplication;
import org.myspring.ZhanshanSpringApplication;
import org.springframework.context.annotation.Bean;

/**
 * Hello world!
 *
 */
@ZhanshanSpringBootApplication
public class UserApplication
{
//    @Bean
//    public JettyWebServer jettyWebServer(){
//        return new JettyWebServer();
//    }
    @Bean
    public TomcatWebServer tomcatWebServer(){
        return new TomcatWebServer();
    }
    public static void main( String[] args )
    {
        ZhanshanSpringApplication.run(UserApplication.class);
    }

}