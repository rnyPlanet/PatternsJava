package com.grin.structural.proxy;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("github/project");

        project.run();
    }
}
