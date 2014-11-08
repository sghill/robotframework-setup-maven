package net.sghill.samples.robotframeworksetup;

import dagger.ObjectGraph;

public class InjectableLibrary {
    public InjectableLibrary() {
        ObjectGraph.create(new RobotModule()).inject(this);
    }
}
