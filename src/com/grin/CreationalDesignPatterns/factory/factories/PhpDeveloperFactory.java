package com.grin.CreationalDesignPatterns.factory.factories;

import com.grin.CreationalDesignPatterns.factory.Developer;
import com.grin.CreationalDesignPatterns.factory.DeveloperFactory;
import com.grin.CreationalDesignPatterns.factory.developers.PhpDeveloper;

public class PhpDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new PhpDeveloper();
    }
}
