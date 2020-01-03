package com.grin.CreationalDesignPatterns.abstractFactory.banking;

import com.grin.CreationalDesignPatterns.abstractFactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes java code...");
    }
}
