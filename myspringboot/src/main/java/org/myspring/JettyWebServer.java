package org.myspring;

public class JettyWebServer implements WebServer{

    @Override
    public void start() {
        System.out.println("Jetty web server");
    }
}
