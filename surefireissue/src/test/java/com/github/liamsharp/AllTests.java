package com.github.liamsharp;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
            AppTest.class
        })

public class AllTests 
{    
    private AllTests()
    {
        // Holder class for annotations.
    }
    
}
