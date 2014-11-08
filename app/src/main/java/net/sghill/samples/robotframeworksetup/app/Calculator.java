package net.sghill.samples.robotframeworksetup.app;

import javax.inject.Inject;

public class Calculator {
    @Inject
    public Calculator() {
    }

    public int add(int a, int b) {
        return a + b;
    }
}
