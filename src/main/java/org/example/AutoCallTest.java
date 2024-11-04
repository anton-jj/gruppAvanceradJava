package org.example;

public class AutoCallTest {

    @AutoCall
    public void autoCallTest() {
        System.out.println("test1");
    }

    @AutoCall
    public void autoCallTest1() {
        System.out.println("test2");
    }

    @AutoCall
    public void autoCallTest2() {
        System.out.println("test3");
    }

}
