package com.grin.CreationalDesignPatterns.abstractFactory.website;

import com.grin.CreationalDesignPatterns.abstractFactory.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("WebsitePM manages project...");
    }
}
