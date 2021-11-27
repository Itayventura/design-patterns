package decorator;

public class CoffeeWithCream extends DecoratorCoffee{

    public CoffeeWithCream(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", cream";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.25;
    }
}
