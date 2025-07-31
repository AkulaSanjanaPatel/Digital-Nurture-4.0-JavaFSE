package com.example;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
    CalculatorTest.class,
    StringUtilTest.class
})
public class AllTests {
    // No code needed; annotations handle everything
}
