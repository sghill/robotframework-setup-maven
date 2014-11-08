package net.sghill.samples.robotframeworksetup;

import javax.inject.Inject;

public class AnnotationBasedDependency {

    @Inject
    public AnnotationBasedDependency() {
    }

    public String getSomeValue() {
        return "Dagger is awesome";
    }
}
