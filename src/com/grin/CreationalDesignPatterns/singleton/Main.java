package com.grin.CreationalDesignPatterns.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton.getInstance().setValue("first");
        Singleton.getInstance().setValue("second");
        Singleton.getInstance().showValue();
    }
}
