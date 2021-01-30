package com.grin.structural.facade;

public class Developer {
    public void doJobBeforeDeadline(BugTracker bugTracker) {
        if (bugTracker.isActiveSptint()) {
            System.out.println("Developer is solving problems...");
        } else {
            System.out.println("Developer is reading Habr");
        }
    }
}
