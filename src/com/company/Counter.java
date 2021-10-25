package com.company;

public class Counter {
    private int count = 0;

    private static int globalCount = 0;

    public void adding() {
        count++;
    }

    public void customAdding(int i) {
        count += i;
    }

    public int getCount() {
        return count;
    }

    public static int getGlobalCount() {
        return globalCount;
    }

    public static void globalAdding() {
        globalCount++;
    }
}
