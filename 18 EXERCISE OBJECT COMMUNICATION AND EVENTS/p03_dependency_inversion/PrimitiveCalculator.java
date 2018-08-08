package p03_dependency_inversion;

import p03_dependency_inversion.factories.StrategiesFactory;
import p03_dependency_inversion.interfaces.Strategy;

public class PrimitiveCalculator {
    private Strategy strategy;

    public PrimitiveCalculator() {
        this.setStrategy();
    }

    private void setStrategy() {
        this.strategy = StrategiesFactory.createStrategy('+');
    }

    public void changeStrategy(char operator) {
        this.strategy = StrategiesFactory.createStrategy(operator);
    }

    public int performCalculation(int firstOperand, int secondOperand) {
        return this.strategy.calculate(firstOperand, secondOperand);
    }
}
