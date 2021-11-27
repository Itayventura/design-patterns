package decorator;

public class SimpleCoffee implements Coffee{

    @Override
    public String getIngredients() {
        return "Coffee Beans";
    }

    @Override
    public double getCost() {
        return 1.0;
    }
}
