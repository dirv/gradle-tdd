# gradle-tdd
This project configures Gradle for those of us who practise test-driven development on the command line, outside of a standard Java IDE. I use this successfully with Vim and Tmux.

# What's included

  * All logging disabled, except for build errors and test output
  * Tests include assertion errors and stack traces
  * Stdout and stderr from tests will be output on screen.

# How to apply to your projects

All relevant changes are in `build.gradle` and `init.gradle`. Simply merge these two files from this repository into your own.

# Running tests

From your project root directory run the following command.

    gradle -I init.gradle test
    
If you run this on this sample repository, you'll see the following output.

```
Test shouldFail(MyTest): This is test output


MyTest > shouldFail FAILED
    java.lang.AssertionError: This is a failure
        at org.junit.Assert.fail(Assert.java:88)
        at MyTest.shouldFail(MyTest.java:7)

1 test completed, 1 failed
```

# Feedback

I hope this proves useful to someone, somewhere. Comments, feedback and pull requests are all welcome!
