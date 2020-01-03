package com.grin.CreationalDesignPatterns.abstractFactory.banking;

import com.grin.CreationalDesignPatterns.abstractFactory.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("BankingPM manages project...");
    }
}
