package com.example.test;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService
public class Java6WS {

    //返回一个复杂对象
    public UserBean doSomething1(String username, String address, boolean flag) {
        return new UserBean(username, address, flag);
    }

    //接收一个复杂对象
    public String doSomething2(UserBean foo) {
        return foo.toString();
    }

    public static void main(String[] args) {
        //发布一个WebService
        Endpoint.publish("http://localhost:9999/java6ws/Java6WS", new Java6WS());
    }
}