package com.example.mybatisdemo;

import com.example.mybatisdemo.model.NoArgUser;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Constructor;

@SpringBootTest
class SampleTest {

    @Test
    void contextLoads() {
        Class<NoArgUser> userClass = NoArgUser.class;
        Constructor<?>[] constructors = userClass.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }
        System.out.println("hoge");

        try {
            System.out.println(userClass.getDeclaredConstructor());
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

}