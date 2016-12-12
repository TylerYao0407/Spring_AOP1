package com.tyler.test;

import com.tyler.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by tyler on 2016/12/1.
 */
public class Test {

    @org.junit.Test
    public void test(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("aop.xml");
        UserService userService = ac.getBean("userService", UserService.class);
        userService.add();
    }
}
