package p03_CoffeeMachine;

import p03_CoffeeMachine.enums.CoffeeSize;
import p03_CoffeeMachine.enums.CoffeeType;

public class Coffee {

    private CoffeeSize size;
    private CoffeeType type;

    public Coffee(CoffeeSize size, CoffeeType type) {
        this.size = size;
        this.type = type;
    }

    public int getPrice() {
        return this.size.getPrice();
    }

    @Override
    public String toString() {
        return this.size + " " + this.type.toString();
    }
}
