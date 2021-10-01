package patterns.strategy.concretestrategy;

import patterns.strategy.strategy.Strategy;

public class ConcreteStrategyB implements Strategy {
    @Override
    public void execute() {
        System.out.println(getClass().getSimpleName() + " launched!");
    }
}
