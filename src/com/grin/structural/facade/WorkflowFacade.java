package com.grin.structural.facade;

public class WorkflowFacade {
    Developer developer = new Developer();
    Job job = new Job();
    BugTracker bugTracker = new BugTracker();

    public void solveProblems() {
        job.doJob();
        bugTracker.startSptint();
        developer.doJobBeforeDeadline(bugTracker);
    }
}
