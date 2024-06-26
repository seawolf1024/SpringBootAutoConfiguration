package org.myspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebServerAutoConfiguration {

    @Bean
    @Conditional(TomcatCondition.class)
    public TomcatWebServer tomcatWebServer(){
        return new TomcatWebServer();
    }
    @Bean
    @Conditional(JettyCondition.class)
    public JettyWebServer jettyWebServer(){
        return new JettyWebServer();
    }
}
