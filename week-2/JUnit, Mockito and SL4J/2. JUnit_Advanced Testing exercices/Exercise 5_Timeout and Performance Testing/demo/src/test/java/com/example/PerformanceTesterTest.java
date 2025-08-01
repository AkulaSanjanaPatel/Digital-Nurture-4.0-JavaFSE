package com.example;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertTimeout;

public class PerformanceTesterTest {

    @Test
    void testPerformanceWithinOneSecond() {
        PerformanceTester pt = new PerformanceTester();

        assertTimeout(Duration.ofMillis(1000), () -> {
            // The code under test must complete in < 1 second
            pt.performTask();
        });
    }
}
