package decorator;

public class CoffeeWithMilk  extends DecoratorCoffee{

    public CoffeeWithMilk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", milk";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.5;
    }
}
