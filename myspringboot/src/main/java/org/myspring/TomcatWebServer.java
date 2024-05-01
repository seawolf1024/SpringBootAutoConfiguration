package org.myspring;

public class TomcatWebServer implements WebServer{

    @Override
    public void start() {
        System.out.println("tomcat web server!");
    }
}
