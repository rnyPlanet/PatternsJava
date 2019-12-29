package com.grin.CreationalDesignPatterns.factory;

import com.grin.CreationalDesignPatterns.factory.factories.CppDeveloperFactory;
import com.grin.CreationalDesignPatterns.factory.factories.JavaDeveloperFactory;
import com.grin.CreationalDesignPatterns.factory.factories.PhpDeveloperFactory;

public class Main {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloper(Speciality.Php);
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();
    }

    private static DeveloperFactory createDeveloper(Speciality speciality) {
        if(speciality == Speciality.Java) {
            return new JavaDeveloperFactory();
        } else if(speciality == Speciality.Cpp) {
            return new CppDeveloperFactory();
        } else if(speciality == Speciality.Php) {
            return new PhpDeveloperFactory();
        } else {
            throw new RuntimeException("Unknown " + speciality);
        }
    }

    private enum Speciality { Java, Cpp, Php; }
}
