package decorator;

public abstract class DecoratorCoffee implements Coffee{

    private final Coffee coffee;

    protected DecoratorCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getIngredients() {
        return coffee.getIngredients();
    }

    @Override
    public double getCost() {
        return coffee.getCost();
    }
}
