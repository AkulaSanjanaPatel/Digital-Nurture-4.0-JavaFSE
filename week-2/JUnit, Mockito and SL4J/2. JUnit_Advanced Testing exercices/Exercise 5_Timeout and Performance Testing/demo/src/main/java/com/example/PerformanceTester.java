package com.example;

public class PerformanceTester {

    // Simulate a task that takes some time
    public void performTask() throws InterruptedException {
        // Simulating a 500ms task
        Thread.sleep(500);
        System.out.println("Task completed");
    }
}
