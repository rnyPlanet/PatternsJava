package com.grin.CreationalDesignPatterns.abstractFactory.website;

import com.grin.CreationalDesignPatterns.abstractFactory.Developer;
import com.grin.CreationalDesignPatterns.abstractFactory.ProjectManager;
import com.grin.CreationalDesignPatterns.abstractFactory.ProjectTeamFactory;
import com.grin.CreationalDesignPatterns.abstractFactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
