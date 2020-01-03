package com.grin.CreationalDesignPatterns.abstractFactory.website;

import com.grin.CreationalDesignPatterns.abstractFactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer writes php code...");
    }
}
