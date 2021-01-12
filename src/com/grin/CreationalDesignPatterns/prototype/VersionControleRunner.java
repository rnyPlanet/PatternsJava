package com.grin.CreationalDesignPatterns.prototype;

public class VersionControleRunner {
    public static void main(String[] args) {
        Project master = new Project(1, "First git project", "code");

        System.out.println(master);

        ProjectFactory factory = new ProjectFactory(master);
        Project masterClone = factory.cloneProject();

        masterClone.setCode("code new");

        System.out.println(master);
        System.out.println(masterClone);
    }
}
