package com.Romka;

import org.junit.jupiter.api.*;
import org.w3c.dom.ls.LSOutput;

public class JUnitDemoTest {


    @BeforeAll
    static void setUP() {
        System.out.println("### @BeforeAll !");
    }

    @AfterAll
    static void tearDown(){
        System.out.println("### @AfterAll !");
    }


@BeforeEach
    void BeforeEachTest(){
        // open("ya.ru");
    System.out.println("###     @BeforeEach !");
}
@AfterEach
    void AfterEachTest() {
    System.out.println("### @AfterEach !");
}

    @Test
    void simpleTestFirst(){
        System.out.println("###         @Test simpleTestFirst !");
        Assertions.assertTrue(3>2);
    }
    @Test
    void simpleTestSecond(){
        System.out.println("###         @Test simpleTestSecond !");
        Assertions.assertTrue(3>2);
    }
}