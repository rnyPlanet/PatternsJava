package com.grin.CreationalDesignPatterns.factory.developers;

import com.grin.CreationalDesignPatterns.factory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer writes php code...");
    }
}
