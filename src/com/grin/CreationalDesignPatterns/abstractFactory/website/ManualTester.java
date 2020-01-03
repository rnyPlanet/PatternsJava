package com.grin.CreationalDesignPatterns.abstractFactory.website;

import com.grin.CreationalDesignPatterns.abstractFactory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("ManualTester tester tests code...");
    }
}
