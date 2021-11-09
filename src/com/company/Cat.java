package com.company;

public class Cat {
    private int old = 4;
    private String name = "Example";
    private int catOld = calculateCatOld(old);


    public Cat() {
        System.out.println("-----------");
    }

    public Cat(int old) {
        this();
        if (old <= 0) old = 1;
        this.old = old;
        catOld = calculateCatOld(old);
    }

    public Cat(int old, String name) {
        this(old);
        this.name = name;
    }


    public static int calculateCatOld(int old) {
        return old * 4;
    }


}
