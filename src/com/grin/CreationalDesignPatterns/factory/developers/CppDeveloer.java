package com.grin.CreationalDesignPatterns.factory.developers;

import com.grin.CreationalDesignPatterns.factory.Developer;

public class CppDeveloer implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Cpp developer writes cpp code...");
    }
}
