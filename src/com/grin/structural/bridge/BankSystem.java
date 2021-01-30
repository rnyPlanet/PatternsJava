package com.grin.structural.bridge;

public class BankSystem extends Program {
    protected BankSystem(Developer developer) {
        super(developer);
    }

    @Override
    public void develop() {
        System.out.println("Bank system in progress...");
        developer.writeCode();
    }
}
