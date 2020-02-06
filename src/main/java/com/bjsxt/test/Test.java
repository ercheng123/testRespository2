package com.bjsxt.test;

import com.bjsxt.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class Test {
    @Autowired
    @Qualifier("jqk")
    private static User abc;

    public static void main(String[] args) {
       test();
    }

    public static void test(){
        System.out.println(abc);
    }


}
