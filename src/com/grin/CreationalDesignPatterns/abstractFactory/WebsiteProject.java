package com.grin.CreationalDesignPatterns.abstractFactory;

import com.grin.CreationalDesignPatterns.abstractFactory.website.WebsiteTeamFactory;

public class WebsiteProject {

    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebsiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating bank system...");

        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }


}
