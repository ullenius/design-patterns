package patterns.strategy.context;

import patterns.strategy.strategy.Strategy;

public class Context {
    private String name;

    public Context(String name) {
        this.name = name;
    }

    public void launch(Strategy strategy) {
        strategy.execute();
    }
}
