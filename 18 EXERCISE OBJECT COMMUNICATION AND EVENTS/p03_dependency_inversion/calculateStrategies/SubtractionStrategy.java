package p03_dependency_inversion.calculateStrategies;

import p03_dependency_inversion.interfaces.Strategy;

public class SubtractionStrategy implements Strategy {
    @Override
    public int calculate(int firstOperand, int secondOperand) {
        return firstOperand - secondOperand;
    }
}
