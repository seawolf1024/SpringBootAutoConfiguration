package org.zhanshan;

import org.myspring.WebServerAutoConfiguration;
import org.myspring.ZhanshanSpringApplication;
import org.myspring.ZhanshanSpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

/**
 * Hello world!
 *
 */
@ZhanshanSpringBootApplication
public class UserApplication
{
    public static void main( String[] args )
    {
        ZhanshanSpringApplication.run(UserApplication.class);
    }

}