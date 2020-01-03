package com.grin.CreationalDesignPatterns.singleton;

public class Singleton {
    private static Singleton instance;
    private String value  = "";

    static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    void setValue(String value) {
        this.value += value + "\n";
    }

    void showValue() {
        System.out.println(value);
    }


}
