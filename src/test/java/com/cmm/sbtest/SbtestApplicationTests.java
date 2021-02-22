package com.cmm.sbtest;

import com.cmm.sbtest.pojo.Dog;
import com.cmm.sbtest.pojo.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SbtestApplicationTests {
    @Autowired
    private Dog dog;
    @Autowired
    private Person person;

    @Test
    void contextLoads() {

    }

}
