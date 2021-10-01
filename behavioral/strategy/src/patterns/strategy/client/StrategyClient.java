package patterns.strategy.client;

import patterns.strategy.concretestrategy.ConcreteStrategyA;
import patterns.strategy.concretestrategy.ConcreteStrategyB;
import patterns.strategy.concretestrategy.ConcreteStrategyC;
import patterns.strategy.context.Context;

public class StrategyClient {
    public static void main(String[] args) {
        Context context = new Context("Launcher");

        context.launch(new ConcreteStrategyA());
        context.launch(new ConcreteStrategyB());
        context.launch(new ConcreteStrategyC());
    }
}
