package net.sghill.samples.robotframeworksetup;

import net.sghill.samples.robotframeworksetup.app.Calculator;

import javax.inject.Inject;

public class SimpleLibrary extends InjectableLibrary {
    @Inject
    AnnotationBasedDependency infrastructure;
    @Inject
    Calculator calculator;

    public void callSomeKeywordOverTheJavaBridge() {
        System.out.println("This value was 100% injected: " + infrastructure.getSomeValue());
    }

    public int addTheNumbersToCalculator(int one, int two) {
        return calculator.add(one, two);
    }
}
