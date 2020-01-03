package com.grin.CreationalDesignPatterns.abstractFactory.banking;

import com.grin.CreationalDesignPatterns.abstractFactory.Developer;
import com.grin.CreationalDesignPatterns.abstractFactory.ProjectManager;
import com.grin.CreationalDesignPatterns.abstractFactory.ProjectTeamFactory;
import com.grin.CreationalDesignPatterns.abstractFactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
