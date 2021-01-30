package com.grin.structural.facade;

public class BugTracker {
    private boolean activeSptint;

    public boolean isActiveSptint() {
        return activeSptint;
    }

    public void startSptint() {
        System.out.println("Spting is active");
        this.activeSptint = true;
    }

    public void finishSprint() {
        System.out.println("Spting is not active");
        this.activeSptint = false;
    }
}
