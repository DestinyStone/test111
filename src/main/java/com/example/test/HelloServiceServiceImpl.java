package com.example.test;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "service=》Good morning : " + name;
    }
}