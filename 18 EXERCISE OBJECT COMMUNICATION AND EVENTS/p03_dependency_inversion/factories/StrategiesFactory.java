package p03_dependency_inversion.factories;

import p03_dependency_inversion.calculateStrategies.AdditionStrategy;
import p03_dependency_inversion.calculateStrategies.DivisionStrategy;
import p03_dependency_inversion.calculateStrategies.MultiplicationStrategy;
import p03_dependency_inversion.calculateStrategies.SubtractionStrategy;
import p03_dependency_inversion.interfaces.Strategy;

public final class StrategiesFactory {

    private StrategiesFactory(){}

    public static Strategy createStrategy(char operator) {
        switch (operator) {
            case '+':
                return new AdditionStrategy();
            case '-':
                return new SubtractionStrategy();
            case '*':
                return new MultiplicationStrategy();
            case '/':
                return new DivisionStrategy();
        }
        return null;
    }
}
