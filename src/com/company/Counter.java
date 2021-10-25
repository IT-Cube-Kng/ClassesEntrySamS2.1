package com.company;


/**
 * Класс-счетчик поддерживающий разные варианты подсчета
 */
public class Counter {
    /**
     * подсчет по инстансам
     **/
    private int count = 0;
    /**
     * общий счетчик
     **/
    private static int globalCount = 0;

    /**
     * Инкремент счетчика
     */
    public void adding() {
        count++;
    }

    /**
     * Инкремент на заданную величину
     *
     * @param i сколько добавить
     */
    public void customAdding(int i) {
        count += i;
    }

    /**
     * Инкремент глобального счетчика
     */
    public static void globalAdding() {
        globalCount++;
    }


    /**
     * Узнать значение счетчика
     *
     * @return число в счетчике
     */
    public int getCount() {
        return count;
    }

    /**
     * Узнать значение глобального счетчика
     *
     * @return число в глобальном счетчике
     */
    public static int getGlobalCount() {
        return globalCount;
    }


    // TODO: Реализовать метод выводящий счетчики трех объектов Counter


}
