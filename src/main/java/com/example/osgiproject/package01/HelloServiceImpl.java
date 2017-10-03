package com.example.osgiproject.package01;

/**
 * Created by dewni on 10/1/17.
 */
public class HelloServiceImpl implements HelloService {

    public void invokeHello() {
        HelloImpl helloimpl = new HelloImpl();
        helloimpl.hello();
    }
}
