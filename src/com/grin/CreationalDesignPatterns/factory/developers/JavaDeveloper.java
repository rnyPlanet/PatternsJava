package com.grin.CreationalDesignPatterns.factory.developers;

import com.grin.CreationalDesignPatterns.factory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes java code...");
    }
}
